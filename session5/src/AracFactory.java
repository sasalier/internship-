public class AracFactory {
    public Arac getArac(int aracType){
        if(aracType <1 || aracType >6){
            return null;
        }
        if(aracType == 1){
            return new Bisiklet();
        }
        else if(aracType==2){
            return new Motorsiklet();
        }
        else if(aracType==3){
            return new Araba();
        }
        else if(aracType==4){
            return new Kamyonet();
        }
        else if(aracType==5){
            return new Otobus();
        }
        else if(aracType==6){
            return new Tir();
        }
        return null;
    }
}
