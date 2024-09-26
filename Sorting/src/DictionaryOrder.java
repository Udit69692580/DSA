public class DictionaryOrder {
    public static void main(String[] args) {
        String[] fruits={"kiwi","apple","papaya","mango"};
        sortFruits(fruits);
        for(String res:fruits){
            System.out.println(res);
        }
    }
    static void sortFruits(String[] fruits){
        for (int i=0;i< fruits.length;i++){
            int min=i;
            for (int j=i+1;j< fruits.length;j++){
                if (fruits[j].compareTo(fruits[min])<0){
                     min=j;
                }
            }
            String temp=fruits[min];
            fruits[min]=fruits[i];
            fruits[i]=temp;

        }
    }
}
