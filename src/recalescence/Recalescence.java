package recalescence;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import recalescence.content.blocks.RecalBlocks;
import recalescence.content.blocks.RecalEnv;

public class Recalescence extends Mod{

    @Override
    public void loadContent() {
        Log.info("recal blok");
        RecalBlocks.load();
        Log.info("recal env")
        RecalEnv.load();
    }

}
