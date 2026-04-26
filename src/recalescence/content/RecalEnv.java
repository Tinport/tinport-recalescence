package recalescence.content.blocks;

import mindustry.content.Items;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.environment.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class RecalEnv {

    public static Block

    //sand
    recalSparseSand, recalSand, recalCompressedSand

    ;

    public static void load(){

        recalSand = new Floor("recal-sand"){{
            variants = 4;
        }};
        recalSparseSand = new Floor("recal-sprase-sand"){{
            variants = 4;
            blendGroup = recalSand;
        }};
        recalCompressedSand = new Floor("recal-compressed-sand"){{
            variants = 4;
            blendGroup = recalSand;
        }};


    }
}