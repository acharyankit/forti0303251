
public class tempClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="A!! th@t gl!tters are n0t g0ld";
		String[] strArr = str.split(" ");
		
		// O/p: !!A t@ht srett!lg era t0n dl0g
		
		for(String s:strArr) {
			System.out.println(s);
			String[] nsArr = s.split("");
			int lenS = s.length();
			for(int i=0; i<lenS; i++) {
				System.out.println("testing post commit modify msg");
				System.out.println("testing post commit modify msg - 2");
//				System.out.println(nsArr[lenS-]);

			}
			
		}

	}

}
