import java.util.Scanner; // ScannerŬ������ ����ϱ� ���� �߰�

class Ex4_3 {
	public static void main(String[] args) {  
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� input�� ����

		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");	
		} else { // input!=0�� ���
			System.out.println("han");
		}
	} // main�� ��
}