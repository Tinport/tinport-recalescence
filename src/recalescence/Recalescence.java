package recalescence;

import arc.*;
import arc.struct.Seq;
import arc.util.*;
import mindustry.Vars;
import mindustry.game.EventType;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.type.ItemStack;
import mindustry.world.Block;

import static arc.Core.bundle;
import static mindustry.Vars.*;

import recalescence.content.blocks.RecalBlocks;
import recalescence.content.blocks.RecalEnv;
import recalescence.world.graphics.RecalShaders;

public class Recalescence extends Mod{

    @Override
    public void loadContent() {

        if (!headless) {
            RecalShaders.load();
        }

        Log.info("recal blok");
        RecalBlocks.load();
        Log.info("recal env");
        RecalEnv.load();
    }

}
