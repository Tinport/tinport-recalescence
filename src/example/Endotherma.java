package endotherma;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import endotherma.content.EndBlocks;

public class Endotherma extends Mod{

    @Override
    public void loadContent() {
        Log.info("drugs");
        EndBlocks.load();
    }

}
