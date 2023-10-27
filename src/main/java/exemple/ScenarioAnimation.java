package exemple;

import java.util.ArrayList;
import java.util.List;

import bandeau.Bandeau;

public class ScenarioAnimation {
    private ArrayList<EffetAnimation> list;

    public ScenarioAnimation(List<EffetAnimation> list){
        this.list=new ArrayList<EffetAnimation>(list);
    }

    public ScenarioAnimation(){
        this.list = new ArrayList<EffetAnimation>();
    }

    public void addEffect(EffetAnimation effet, int repetitions){
        for(int i=0; i < repetitions; i++ ){
            list.add(effet);
        }
    }

    public void action(Bandeau monBandeau){
        for(EffetAnimation b :list){
            b.action(monBandeau);
        }
    }
}
