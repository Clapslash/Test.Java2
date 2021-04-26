

public class Main {
    public static void main(String[] args) {
        JumpAndRun[] members = {
                new Human(5, 5, "Grisha"),
                new Human(4, 2, "Masha"),
                new Cat(3, 5, "Barsik"),
                new Cat(1, 1, "Murzik"),
                new Robot(3, 3, "Chappi"),
                new Robot(4, 4, "Metal")
        };

        Obstaclable[] obstacles = {
                new Track(1),
                new Track(4),
                new Wall(1),
                new Wall(3)
        };

        for (JumpAndRun member : members) {
            System.out.println("К прохождению препятствий приступает " + member);
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("И у него получается!");
                } else {
                    winner = false;
                    System.out.println("И у него не получается.");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошёл дистанцию!");
            } else {
                System.out.println(member + " проиграл.");
            }
            System.out.println();
        }
    }
}
