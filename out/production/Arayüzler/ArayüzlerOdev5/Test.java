public class Test {
    public static void main(String[] args) {
            Cloth cloth1 = new Cloth(12,2,"a12","Jean","Woman","M");
            System.out.println(cloth1.toString());
            cloth1.getDepot();
            cloth1.getPlace();
            cloth1.purchase();

        System.out.println();

            OldComputers oldComputers = new OldComputers("HP Computers",2000);
            oldComputers.purchase();

        System.out.println();

            Gift gift1 = new Gift("b202a","Mug");
            gift1.getDepot();
            gift1.giveAGift();

        System.out.println();

            Consultancy consultancy = new Consultancy(6000,300,"12cns","Sales","Sales Concultancy ");
            consultancy.purchase();






    }
}
