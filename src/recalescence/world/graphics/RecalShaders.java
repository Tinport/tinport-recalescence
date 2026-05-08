package recalescence.world.graphics;

import arc.Core;
import arc.files.Fi;
import arc.graphics.*;
import arc.graphics.Color;
import arc.graphics.Pixmap;
import arc.graphics.Texture;
import arc.graphics.gl.FrameBuffer;
import arc.graphics.gl.Shader;
import arc.math.geom.Vec3;
import arc.scene.ui.layout.Scl;
import arc.util.*;
import arc.util.Nullable;
import arc.util.Reflect;
import arc.util.Time;
import mindustry.Vars;
import mindustry.graphics.CacheLayer;
import mindustry.graphics.Shaders;
import mindustry.type.Planet;

import static arc.Core.*;
import static arc.Core.assets;
import static mindustry.Vars.*;
import static mindustry.Vars.renderer;
import static mindustry.Vars.tree;

//yeah copy and paste from minedusty surely itll work!
public class RecalShaders {
    public static @Nullable SurfaceShader recalWater;
    public static CacheLayer recalWaterLayer;

    // not exactly sure how to do shader stuff properly - kirby
    public static void load(){
        recalWater = new SurfaceShader("recalWater");
                CacheLayer.add(
                        recalWaterLayer = new CacheLayer.ShaderLayer(recalWater)
                );
    }
    public static class SurfaceShader extends Shader {
        Texture noiseTex;

        public SurfaceShader(String frag) {
            super(Shaders.getShaderFi("screenspace.vert"), tree.get("shaders/" + frag + ".frag"));
            loadNoise();
        }

        public String textureName() {
            return "noise";
        }

        public void loadNoise() {
            assets.load("sprites/" + textureName() + ".png", Texture.class).loaded = t -> {
                t.setFilter(Texture.TextureFilter.linear);
                t.setWrap(Texture.TextureWrap.repeat);
            };
        }

        @Override
        public void apply() {
            setUniformf("u_campos", camera.position.x - camera.width / 2, camera.position.y - camera.height / 2);
            setUniformf("u_ccampos", camera.position);
            setUniformf("u_resolution", camera.width, camera.height);
            setUniformf("u_rresolution", graphics.getWidth(), graphics.getHeight());
            setUniformf("u_time", Time.time);

            if(hasUniform("u_noise")) {
                if(noiseTex == null) {
                    noiseTex = assets.get("sprites/" + textureName() + ".png", Texture.class);
                }

                noiseTex.bind(1);
                renderer.effectBuffer.getTexture().bind(0);

                setUniformi("u_noise", 1);
            }
        }
    }
}