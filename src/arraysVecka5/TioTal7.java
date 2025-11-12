package arraysVecka5;

public class TioTal7 {
    static void main(String[] args) {
        int[] tioTal = {32, 42, 24, -423, 4, 3, 4, 324, 34, 23};
        int minstaTalet = tioTal[0];
        int störstaTalet = tioTal[0];
        for (int i = 0; i < tioTal.length; i++) {
            if (minstaTalet > tioTal[i]) {
                minstaTalet = tioTal[i];
            } else if (störstaTalet < tioTal[i]) {
                störstaTalet = tioTal[i];
            }

        }
        System.out.println(minstaTalet);
        System.out.println(störstaTalet);
    }
}
//En array med 10 inlästa tal finns. Leta upp det största och det minsta talet i arrayn och
//skriv ut dem.