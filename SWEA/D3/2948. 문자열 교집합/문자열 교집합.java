import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

class Solution {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			sb.append("#").append(test_case).append(" ");
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			// 두 집합에 모두 속하는 문자열을 찾기 위해 Set을 사용하자
			HashSet<String> set = new HashSet<String>();

			// N 집합에 속하는 것을 먼저 set에 넣고
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++)
				set.add(st.nextToken());

			// M 집합에 속하는 것도 set에 넣어 중복된 수를 세자
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++)
				set.add(st.nextToken());

			int answer = N + M - set.size();

			sb.append(answer);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}