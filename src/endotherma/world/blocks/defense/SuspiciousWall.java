package endotherma.world.blocks.defense;

import arc.*;
import arc.audio.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.struct.*;
import arc.util.*;
import arc.util.io.*;
import mindustry.entities.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.annotations.Annotations.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.logic.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.blocks.heat.*;


import static mindustry.Vars.*;

public class SuspiciousWall extends Wall {

    public SuspiciousWall(String name){
        super(name);
        solid = true;
        destructible = true;
        group = BlockGroup.walls;
        buildCostMultiplier = 6f;
        canOverdrive = false;
        drawDisabled = false;
        crushDamageMultiplier = 5f;
        priority = TargetPriority.wall;

        //it's a wall of course it's supported everywhere
        envEnabled = Env.any;
    }
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