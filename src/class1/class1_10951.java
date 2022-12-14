package class1;

import java.util.Scanner;

/**
 * EOF(End Of File) 문제
 * 이 문제의 목적은 파일의 끝(EOF)을 올바르게 판단하는 법을 연습하는 것입니다. 총 몇 줄이 주어진다 등의 정보는 절대 입력으로 주지 않습니다. 또한 단순히 키보드로 입력 내용만 적고 프로그램이 종료되지 않은 상태까지만 봐서는 EOF를 제대로 처리했는지 알 수 없습니다. 더 이상 읽을 게 없을 때 프로그램을 종료하는 법을 알아야 합니다. 그 방법은 언어마다 다르고 사용하는 함수마다 다르니, 구글에 "C언어 EOF" 와 같이 검색해서 그 방법을 알아보세요. 주로 파일 입출력으로 설명되어 있겠지만, 입력 스트림도 파일 입력이기 때문에 결국 동일합니다. 자바의 경우 Scanner와 BufferedReader에서 해야 하는 처리가 서로 다릅니다. 언어를 불문하고, 레퍼런스를 참고해서 사용법을 정확하게 숙지하는 습관을 들이세요.
 * (C/C++) scanf는 EOF를 반환하지, 변수에 저장해주지 않습니다.
 * (Java) Scanner의 메서드들은 NoSuchElementException을 던집니다.
 * (Java) BufferedReader.readLine()은 null을 반환합니다.
 * (Python) input()은 EOFError를 발생시킵니다.
 * (Python) sys.stdin.readline()은 빈 문자열을 반환합니다.
 * 이 문제에 대한 프로그램을 직접 테스트 해보려면 입력 내용을 파일에 저장해 놓고 freopen 등을 이용해서 프로그램에 표준 입력으로 보내주거나, 터미널에서 파이프로 넘겨주나, 또는 직접 키보드로 치다가 컨트롤 Z (윈도우즈), 컨트롤 D (맥, 리눅스) 를 눌러주는 방법이 있습니다. 이상하게도, 윈도우즈의 경우 컨트롤 Z를 여러 번 입력해줘야 인식되는 경우가 있는 것 같습니다.
 * 입력받은 내용을 모조리 저장해 놓고 나중에 몰아서 출력할 필요가 없습니다. 입력 스트림과 출력 스트림은 별개이므로, 한 케이스 입력받고 그에 대한 답을 구한 뒤 바로 출력하는 것을 반복해도 됩니다. 화면에 입력과 출력이 섞여서 나오는 것은 아무 상관 없습니다.
 */
public class class1_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(!(A>0 && A<10) && !(B>0 && B<10)) {
                break;
            }
            System.out.println(A+B);
        }
        sc.close();
    }
}
