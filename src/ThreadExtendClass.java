class Fazil extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        Fazil t1=new Fazil();
        t1.start();
    }
}  