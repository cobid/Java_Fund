package FINALEXAM_Preparation;

import java.util.*;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroesMap = new LinkedHashMap<>();
        for (int i = 0; i < num; i++) {
            String[] heroes = scanner.nextLine().split(" ");
            String hero = heroes[0];
            int HP = Integer.parseInt(heroes[1]);
            int MP = Integer.parseInt(heroes[2]);
            List<Integer> hpAndMp = new ArrayList<>();
            hpAndMp.add(0, HP);
            hpAndMp.add(1, MP);
            heroesMap.put(hero, hpAndMp);
        }
        String gameInput = scanner.nextLine();
        while (!gameInput.equals("End")) {
            String[] commandsArr = gameInput.split(" - ");
            String command = commandsArr[0];
            String heroName = commandsArr[1];
            switch (command) {
                case "CastSpell":
                    int manaPoints = Integer.parseInt(commandsArr[2]);
                    String name = commandsArr[3];
                    int currentManaPoints = heroesMap.get(heroName).get(1);
                    if (currentManaPoints >= manaPoints) {
                        heroesMap.get(heroName).set(1, currentManaPoints - manaPoints);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, name,
                                currentManaPoints - manaPoints);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, name);
                    }
                    break;
                case "TakeDamage":

                    int damage = Integer.parseInt(commandsArr[2]);
                    String attacker = commandsArr[3];
                    int currentDamage = heroesMap.get(heroName).get(0);
                    if (currentDamage > damage) {
                        heroesMap.get(heroName).set(0, currentDamage - damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker,
                                currentDamage - damage);
                    } else {
                        heroesMap.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(commandsArr[2]);
                    int currentMp = heroesMap.get(heroName).get(1);
                    if (currentMp + amount < 200) {
                        heroesMap.get(heroName).set(1, currentMp + amount);
                        System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                    } else {
                        heroesMap.get(heroName).set(1, 200);
                        System.out.printf("%s recharged for %d MP!%n", heroName, 200 - currentMp);
                    }
                    break;
                case "Heal":
                    int amound = Integer.parseInt(commandsArr[2]);
                    int currentHp = heroesMap.get(heroName).get(0);

                    if (currentHp + amound < 100) {
                        heroesMap.get(heroName).set(0, currentHp + amound);
                        System.out.printf("%s healed for %d HP!%n", heroName, amound);
                    } else {
                        heroesMap.get(heroName).set(0, 100);
                        System.out.printf("%s healed for %d HP!%n", heroName, 100 - currentHp);
                    }
                    break;
            }
            gameInput = scanner.nextLine();
        }

        heroesMap.forEach((k,v)-> System.out.printf("%s%n" +
                "  HP: %d%n" +
                "  MP: %d%n", k, v.get(0), v.get(1)));

    }
}
