public class flowcontrol {
    public static void main(String[] args){
        System.out.println("第一步");
        System.out.println("第二步");
        int i=10;
        //执行某个分支后，不想执行其他分支，break
        switch(i){
            case 10 :
                System.out.println("分支1");
            case 20 :
                System.out.println("分支2");
            default:
                System.out.println("其他分支");
        }
        //分支 条件判断
    }
}
