import datingapp.Profile;
import datingapp.Util;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Profile> profiles = Arrays.asList(
                new Profile("Alice", "Enjoys hiking and photography", "hiking", 26, "traveling"),
                new Profile("Bob", "Movie enthusiast", "cooking", 29, "movies, music"),
                new Profile("Charlie", "Passionate about photography", "photography", 22, "cooking, movies"),
                new Profile("Diana", "", "", 31, ""),
                new Profile("Edward", "Loves the outdoors and hiking", "hiking", 27, "coffee, traveling"),
                new Profile("Fiona", "Avid cook", "cooking", 34, "music, traveling"),
                new Profile("George", "Cinema lover", "acting", 23, "movies, theater"),
                new Profile("Hannah", "Music and photography are my life", "photography", 21, "music, arts"),
                new Profile("Ian", "", "gaming", 17, "movies"),
                new Profile("Julia", "Adventurer and hiker", "hiking", 28, "outdoor activities"),
                new Profile("Kyle", "Tech enthusiast", "coding", 40, "gadgets"),
                new Profile("Linda", "Business analyst", "reading", 45, "economics"),
                new Profile("Mike", "Gym goer", "working out", 25, "health"),
                new Profile("Nina", "High school teacher", "teaching", 37, "education"),
                new Profile("Oscar", "Engineer", "problem solving", 29, "technology"),
        new Profile("Olivia", "Fascinated by the arts", "painting", 24, "arts, galleries"),
                new Profile("Noah", "Fitness enthusiast", "running", 26, "marathons, health"),
                new Profile("Emma", "Tech lover and coder", "coding", 30, "technology, startups"),
                new Profile("Liam", "Professional chef", "cooking", 32, "food festivals"),
                new Profile("Sophia", "Documentary filmmaker", "filmmaking", 29, "movies, documentaries"),
                new Profile("Mason", "Budding musician", "music", 21, "guitar, concerts"),
                new Profile("Isabella", "Avid reader and writer", "writing", 28, "literature, poetry"),
                new Profile("Jacob", "Outdoor adventure lover", "hiking", 35, "camping, climbing"),
                new Profile("Ava", "Health and wellness advocate", "yoga", 27, "meditation, fitness"),
                new Profile("William", "Coffee connoisseur", "exploring coffee cultures", 34, "coffee, travel"),
                new Profile("Mia", "Passionate about photography", "photography", 22, "traveling, arts"),
                new Profile("Ethan", "Cinema enthusiast", "watching movies", 23, "film making, acting"),
                new Profile("James", "Amateur astronomer", "astronomy", 25, "stargazing, science"),
                new Profile("Alexander", "History buff", "studying history", 31, "museums, books"),
                new Profile("Emily", "Dedicated environmentalist", "environmental activism", 29, "sustainability, conservation"),
                new Profile("Michael", "Professional gamer", "gaming", 24, "esports, streaming"),
                new Profile("Benjamin", "Jazz musician", "playing jazz music", 26, "saxophone, live performances"),
                new Profile("Charlotte", "Ballet dancer", "ballet", 22, "dance, performances"),
                new Profile("Daniel", "Aspiring actor", "acting", 20, "theater, movies"),
                new Profile("Amelia", "Creative writer", "writing", 25, "fiction, poetry"),
                new Profile("Henry", "Robotics engineer", "building robots", 27, "technology, innovation"),
                new Profile("Joseph", "Political scientist", "researching politics", 29, "debate, policy analysis"),
                new Profile("Chloe", "Surfer", "surfing", 26, "beach, travel"),
                new Profile("David", "Veterinarian", "animal care", 32, "pets, wildlife conservation"),
                new Profile("Ella", "Urban planner", "designing cities", 30, "architecture, sustainability")

        );

        System.out.println("\n\nPart 1: ");
        Util.hikersOver25(profiles).forEach(profile -> {
            System.out.println(profile.getProfileName() + " likes to hike and is over 25!");
        });

        System.out.println("\n\nPart 2: ");
        Util.likesMoviesBetween18and35(profiles).forEach(profile -> {
            System.out.println(profile.getProfileName() + " is between the ages of 18 and 35 and likes movies!");
        });

        System.out.println("\n\nPart 3: ");
        Util.instagramUsers(profiles).forEach(profile -> {
            System.out.println(profile.getProfileName() + " is an Instagram user (they like to cook and take pictures of it).");
        });

        System.out.println("\n\nPart 4: ");
        Util.boringPeople(profiles).forEach(profile -> {
            System.out.println(profile.getProfileName() + " isn't horribly boring and actually has hobbies!");
        });

        System.out.println("\n\nPart 5: ");
        System.out.println("List of all ages: " + Util.getAllAges(profiles));

        System.out.println("\n\nPart 6: ");
        System.out.println("All names capitalized: " + Util.weUseProperCapitalizationInThisHouse(profiles));

        System.out.println("\n\nPart 7: ");
        System.out.println(Util.checkForChildren(profiles));

        System.out.println("\n\nPart 8: ");
        System.out.println("There are " + Util.normalPeople(profiles) + " music lovers.");

        System.out.println("\n\nPart 9: \n" + Util.sameSameButDifferent(profiles));
    }
}