package Inflearn.simulation;

class Puppy {
    int x;
    int y;
    int direction;

    public Puppy(int direction) {
        this.direction = direction;
    }
}

class Person {
    int x;
    int y;
    int direction;

    public Person(int direction) {
        this.direction = direction;
    }
}
class 잃어버린_강아지 {
    static final int MAP_SIZE = 10;

    public int solution(int[][] map){
        final int NORTH = 0;
        Puppy puppy = new Puppy(NORTH);
        Person person = new Person(NORTH);
        int answer = 0;
        int time = 0;
        final int MAP_SIZE = 10;
        final int LIMIT_TIME = 10000;
        final int TREE = 1;
        final int PERSON = 2;
        final int PUPPY = 3;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if (map[i][j] == PERSON) {
                    person.x = i;
                    person.y = j;

                }
                if (map[i][j] == PUPPY) {
                    puppy.x = i;
                    puppy.y = j;
                }
            }
        }

        while (time < LIMIT_TIME) {
            time++;

            // 사람 이동 OR 회전
            int personNowX = person.x + dx[person.direction];
            int personNowY = person.y + dy[person.direction];

            if (!isArea(personNowX, personNowY) || map[personNowX][personNowY] == TREE) {
                person.direction = turn(person.direction);
            } else {
                person.x = personNowX;
                person.y = personNowY;
            }

            // 강아지 이동 OR 회전
            int puppyNowX = puppy.x + dx[puppy.direction];
            int puppyNowY = puppy.y + dy[puppy.direction];

            if (!isArea(puppyNowX, puppyNowY) || map[puppyNowX][puppyNowY] == TREE) {
                puppy.direction = turn(puppy.direction);
            } else {
                puppy.x = puppyNowX;
                puppy.y = puppyNowY;
            }

            // 강아지를 찾으면
            if (findPuppy(person, puppy)) {
                answer = time;
                break;
            }
        }

        return answer;
    }

    public static boolean isArea(int x, int y) {
        if (x >= 0 && y >= 0 && x < MAP_SIZE && y < MAP_SIZE) {
            return true;
        }
        return false;
    }

    public static int turn(int direction) {
        return (direction + 1) % 4;
    }

    public static boolean findPuppy(Person person, Puppy puppy) {
        return puppy.x == person.x && puppy.y == person.y;
    }

    public static void main(String[] args){
        잃어버린_강아지 T = new 잃어버린_강아지();
        int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 2, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 0}};
        System.out.println(T.solution(arr1));
        int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 2, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 3}};
        System.out.println(T.solution(arr2));
    }
}
