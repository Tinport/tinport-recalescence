package example;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import endotherma.content.EndBlocks

public class Endotherma extends Mod{

    public Endotherma(){
        Log.info("drugs 2");

    @Override
    public void loadContent(){
        Log.info("drugs");
        EndBlocks.load();
    }

}
