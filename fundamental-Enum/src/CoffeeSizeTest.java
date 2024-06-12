 enum CoffeeSize{
        NORMAL(4),
        BIG(8),
        HUGE(10){
            public String getLidCode(){
                return "C";
            }
        },
        OVERWHELMING(16) {

            public String getLidCode(){
                return "A";
            }
        };

        private int ounces;

        public int getOunces(){
            return ounces;
        }

        CoffeeSize(int ounces){
            this.ounces = ounces;
        }

        public String getLidCode(){
            return "B";
        }
    }

public class CoffeeSizeTest {
    public static void main(String[] args) {
        CoffeeSize[] transport = new CoffeeSize[]{CoffeeSize.NORMAL,
                CoffeeSize.BIG,
                CoffeeSize.OVERWHELMING,
                CoffeeSize.HUGE};

        for(CoffeeSize pkg : transport) {
            System.out.println(pkg.name() + " ounces:" + pkg.getOunces() + ", lid code: " + pkg.getLidCode());

        }

    }

}
