

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class FactorsCached {
    public static Map<Long, Long> factors(long num) {
        Map<Long, Long> factors = new HashMap<>();
        for (long i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                num /= i;
                if ((factors.containsKey(i))) {
                    factors.put(i, factors.get(i) + 1);
                } else {
                    factors.put(i, 1L);
                }
            }
        }
        if (num > 1)
            factors.put(num, 1L);
        return factors;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());

        for (int i = 0; i < T; i++) {

            int N = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Long product = 1L;
            Map<Long, Long> allFactors = new HashMap<>();

            for (int j = 0; j < N; j++) {
                var result = factors(Long.parseLong(st.nextToken()));

                for (var e : result.entrySet()){
                    if (allFactors.containsKey(e.getKey())) {
                        allFactors.put(e.getKey(), allFactors.get(e.getKey()) +
                                e.getValue());
                    } else
                        allFactors.put(e.getKey(), e.getValue());
                }
            }

            Long result = allFactors.values().stream().map(aLong -> aLong + 1L).reduce(1L,
                    (aLong, aLong2) -> aLong * aLong2);
            System.out.println(result);
        }
        br.close();
    }
}
