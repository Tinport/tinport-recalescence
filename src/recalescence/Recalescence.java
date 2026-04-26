package recalescence;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import recalescence.content.RecalBlocks;

public class Recalescence extends Mod{

    @Override
    public void loadContent() {
        Log.info("drugs");
        RecalBlocks.load();
    }

}
