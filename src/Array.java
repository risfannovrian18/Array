import java.util.Arrays;
public class Array {
	public static void main(String []args) {
		int[] tahunCovid = {2,0,1,9};
		System.out.println(tahunCovid [2]); // mencetak element array pada indeks ke 2
		tahunCovid [2] = 2; // mengubah elemen array pada indeks ke 2 menjadi 2
		tahunCovid [3] = 1; // mengubah elemen array pada indeks ke 3 menjadi 1
		System.out.println(Arrays.toString(tahunCovid)); // mencetak seluruh elemen array
		System.out.println(tahunCovid[2]);
		System.out.println(tahunCovid.length); // mencetak jumlah elemen dalam array
		System.out.println();

		// contoh melakukan perulangan untuk mencetak nilai array
		String[] akuSuka = {"Aku", "Suka", "Ngoding"};
		for (int i =0; i < akuSuka.length; i ++) {
			System.out.println(akuSuka[i]);

		}
	}
}
