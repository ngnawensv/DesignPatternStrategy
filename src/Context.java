public class Context {
    public  void strategyApply(int level){
        if(level == 0) {
            System.out.println("j'applique la strategy initiale");
        } else if (level == 1){
            System.out.println("j'applique la strategy niveau 1");
        }else if(level == 2){
            System.out.println("j'applique la strategy niveau 2");
        }else{
            System.out.println("j'applique la strategy par defaut");
        }
    }
}
