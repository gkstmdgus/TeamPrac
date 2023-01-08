import java.util.Scanner; // ScannerŬ������ ����ϱ� ���� �߰�

class Ex4_3 {
	public static void main(String[] args) {
		System.out.print("GeonHo lee가 했습니다.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� input�� ����

		if(input==0) {
			System.out.println("NA");	
		} else { // input!=0�� ���
			System.out.println("han");
		}
	} // main�� ��
}