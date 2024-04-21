import java.util.*;

public class All_Number_Programs {

    void Prime(int n) {
        boolean f = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not a prime number");
                f = false;
                return;
            }
        }
        if (f)
            System.out.println("Prime Number");
    }

    void Buzz(int n) {
        if (n % 10 == 7 || n / 10 == 7) {
            System.out.println("Buzz Number");
        } else {
            System.out.println("Not a Buzz Number");
        }
    }

    void Plaindrome(int n) {
        int rem, rev = 0;
        int temp = n;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if (temp == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }

    void Armstrong(int n) {
        int l = 0, sum = 0, rem;
        int temp = n;
        while (n != 0) {
            n /= 10;
            l++;
        }
        n = temp;
        while (n != 0) {
            rem = n % 10;
            sum = sum + (int) Math.pow(rem, l);
            n /= 10;
        }
        if (temp == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }

    void Perfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }

    void Abundant(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum > n) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
    }

    void Deficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum < n) {
            System.out.println("Deficiant Number");
        } else {
            System.out.println("Not a Deficiant Number");
        }
    }

    void Neon(int n) {
        int sum = 0, sq = n * n;
        while (sq != 0) {
            int rem = sq % 10;
            sum = sum + rem;
            sq /= 10;
        }
        if (sum == n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }

    void Niven(int n) {
        int sum = 0;
        int temp = n;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            n /= 10;
        }
        if (temp % sum == 0) {
            System.out.println("Niven Number");
        } else {
            System.out.println("Not a Niven Number");
        }
    }

    void Spy(int n) {
        int rem, sum = 0, prod = 1;
        while (n != 0) {
            rem = n % 10;
            sum = sum + rem;
            prod = prod * rem;
            n /= 10;
        }
        if (sum == prod) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }
    }

    void Duck(int n) {
        boolean f = false;
        while (n != 0) {
            int rem = n % 10;
            if (rem == 0) {
                f = true;
            }
            n /= 10;
        }
        if (f == true) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
    }

    void Kaprekar(int n) {
        int sq = n * n;
        int l = 0, sum = 0;
        int temp = sq;
        while (sq != 0) {
            sq /= 10;
            l++;
        }
        int x = (int) Math.pow(10, (l / 2));
        while (temp != 0) {
            sum = sum + temp % x;
            temp /= x;
        }
        if (sum == n) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }
    }

    void Tech(int n) {
        int l = 0, sq = 0;
        int temp = n;
        while (n != 0) {
            n /= 10;
            l++;
        }
        n = temp;
        if (l % 2 == 0) {
            int right = n % (int) Math.pow(10, (l / 2));
            int left = n / (int) Math.pow(10, (l / 2));
            sq = (right + left) * (right + left);
            if (sq == temp) {
                System.out.println("Tech Number");
            } else {
                System.out.println("Not a Tech Number");
            }
        } else {
            System.out.println("Not a Tech Number");
        }
    }

    void Automorphic(int n) {
        int l = 0;
        int sq = n * n;
        int temp = n;
        while (n != 0) {
            n /= 10;
            l++;
        }
        if (sq % (int) Math.pow(10, l) == temp) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }
    }

    void Disarium(int n) {
        int temp = n, l = 0, sum = 0;
        while (n != 0) {
            n /= 10;
            l++;
        }
        n = temp;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, l);
            n /= 10;
            --l;
        }
        if (sum == temp) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not a Disarium Number");
        }
    }

    void Pronic(int n) {
        boolean f = false;
        for (int i = 1; i <= n; i++) {
            if (i * (i + 1) == n) {
                f = true;
                break;
            }
        }
        if (f) {
            System.out.println("Pronic Number");
        } else {
            System.out.println("Not a Pronic Number");
        }
    }

    void Dudeney(int n) {
        int sum = 0;
        int cr = (int) Math.round(Math.cbrt(n));
        if (cr * cr * cr == n) {
            while (n != 0) {
                int rem = n % 10;
                sum = sum + rem;
                n /= 10;
            }
            if (sum == cr) {
                System.out.println("Dudeney Number");
            } else {
                System.out.println("Not a Dudeney Number");
            }
        } else
            System.out.println("Not a Dudeney Number");
    }

    void Special(int n) {
        int sum = 0;
        int temp = n;
        while (n != 0) {
            int rem = n % 10;
            int f = 1;
            for (int i = 1; i <= rem; i++) {
                f = f * i;
            }
            sum = sum + f;
            n /= 10;
        }
        if (sum == temp) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not a Special Number");
        }
    }

    void Magic(int n) {
        int sum = 0;
        while (n > 9) {
            while (n != 0) {
                int rem = n % 10;
                sum = sum + rem;
                n /= 10;
            }
            n = sum;
            sum = 0;
        }
        if (n == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not a Magic Number");
        }
    }

    void Ugly(int n) {
        boolean f = true;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 5 == 0) {
                n /= 5;
            } else {
                f = false;
                break;
            }
        }
        if (f) {
            System.out.println("Ugly Number");
        } else {
            System.out.println("Not an Ugly Number");
        }
    }

    void Lcm(int a, int b) {
        int max, min, gcd = 1, lcm = 1;
        max = a;
        min = b;
        if (min > a) {
            max = b;
            min = a;
        } else {
            max = a;
            min = b;
        }
        while (max > min) {
            int r = max % min;
            if (r == 0) {
                gcd = min;
                break;
            } else {
                max = min;
                min = r;
            }
        }
        lcm = (a * b) / gcd;
        System.out.println("LCM = " + lcm);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        All_Number_Programs obj = new All_Number_Programs();
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        obj.Prime(n);
        // obj.Buzz(177);
        // obj.Plaindrome(121);
        // obj.Armstrong(153);
        // obj.Perfect(28);
        // obj.Abundant(12);
        // obj.Deficient(45);
        // obj.Niven(18);
        // obj.Duck(801);
        // obj.Kaprekar(45);
        // obj.Tech(2025);
        // obj.Spy(22);
        // obj.Automorphic(25);
        // obj.Disarium(135);
        // obj.Pronic(6);
        // obj.Dudeney(512);
        // obj.Special(145);
        // obj.Magic(1252);
        // obj.Ugly(18);
        // obj.Lcm(12, 8);
        // Check if the number is a Buzz number (divisible by 7 or ends with 7)
        obj.Buzz(177);

        // Check if the number is a Palindrome number (reads the same backward as
        // forward)
        obj.Plaindrome(121);

        // Check if the number is an Armstrong number (sum of its own digits each raised
        // to the power of the number of digits)
        obj.Armstrong(153);

        // Check if the number is a Perfect number (equal to the sum of its proper
        // divisors, excluding itself)
        obj.Perfect(28);

        // Check if the number is an Abundant number (sum of its proper divisors is
        // greater than the number itself)
        obj.Abundant(12);

        // Check if the number is a Deficient number (sum of its proper divisors is less
        // than the number itself)
        obj.Deficient(45);

        // Check if the number is a Niven number
        obj.Niven(18);

        // Check if the number is a Duck number
        obj.Duck(801);

        // Check if the number is a Kaprekar number
        obj.Kaprekar(45);

        // Check if the number is a Tech number
        obj.Tech(2025);

        // Check if the number is a Spy number
        obj.Spy(22);

        // Check if the number is an Automorphic number
        obj.Automorphic(25);

        // Check if the number is a Disarium number
        obj.Disarium(135);

        // Check if the number is a Pronic number
        obj.Pronic(6);

        // Check if the number is a Dudeney number
        obj.Dudeney(512);

        // Check if the number is a Special number
        obj.Special(145);

        // Check if the number is a Magic number
        obj.Magic(1252);

        // Check if the number is an Ugly number
        obj.Ugly(18);

        // Calculate the least common multiple of two numbers
        obj.Lcm(12, 8);

        sc.close();
    }
}
