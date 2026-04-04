package endotherma.world.blocks.defense;

import arc.*;
import arc.audio.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import mindustry.entities.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.world.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;

public class SuspiciousWall extends Wall {
    @Override
    public boolean configTapped(){
        configure(!enabled);
        clickSound.at(this);
        return false;
    }
    @Override
    public void draw(){
        super.draw();

        if(enabled){
            Events.fire(Trigger.thoriumReactorOverheat);
            kill();
        }
    }

}