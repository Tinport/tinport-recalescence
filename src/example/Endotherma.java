package example;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("drugs 2");

    @Override
    public void loadContent(){
        Log.info("drugs");
        EndBlocks.load();
    }

}
