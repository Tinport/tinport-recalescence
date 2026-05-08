package recalescence.content.blocks;

import mindustry.content.Items;
import mindustry.content.StatusEffects;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class RecalEnv {

    public static Block

    //sand
    recalSparseSand, recalSand, recalCompressedSand,
    recalWaterySand, recalUnderwaterSand, recalWater, recalDeepWater

    ;

    public static void load(){

        recalSand = new Floor("recal-sand", 4){{
        }};
        recalSparseSand = new Floor("recal-sparse-sand", 4){{
        }};
        recalCompressedSand = new Floor("recal-compressed-sand", 4){{
        }};
        recalDeepWater = new Floor("recal-deep-water", 4){{
            speedMultiplier = 0.5f;
            drownTime = 200f;
            variants = 4;
            isLiquid = true;
            status = StatusEffects.wet;
            statusDuration = 120f;
            cacheLayer = CacheLayer.water;
            albedo = 0.9f;
            supportsOverlay = true;
        }};
        recalWater = new Floor("recal-water", 4){{
            speedMultiplier = 0.65f;
            variants = 4;
            isLiquid = true;
            status = StatusEffects.wet;
            statusDuration = 120f;
            cacheLayer = CacheLayer.water;
            albedo = 0.9f;
            supportsOverlay = true;
        }};
        recalUnderwaterSand = new Floor("recal-underwater-sand"){{
            variants = 4;
            speedMultiplier = 0.8f;
            isLiquid = true;
            status = StatusEffects.wet;
            statusDuration = 60f;
            albedo = 0.9f;
            cacheLayer = CacheLayer.water;
            supportsOverlay = true;
        }};
        recalWaterySand = new Floor("recal-watery-sand"){{
            variants = 4;
            speedMultiplier = 0.9f;
            isLiquid = true;
            status = StatusEffects.wet;
            statusDuration = 20f;
            albedo = 0.9f;
            cacheLayer = CacheLayer.water;
            supportsOverlay = true;
        }};


    }
}