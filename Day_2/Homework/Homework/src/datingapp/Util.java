package datingapp;
import java.util.List;
import java.util.stream.Collectors;

public class Util {
    public static List<Profile> hikersOver25 (List<Profile> inputProfiles) {
        return inputProfiles.stream().filter(profile -> profile.getAge() >= 25 && profile.getHobby().contains("hiking")).collect(Collectors.toList());
    }

    public static List<Profile> likesMoviesBetween18and35 (List<Profile> inputProfiles) {
        return inputProfiles.stream().filter(profile -> profile.getAge() >= 18 && profile.getAge() <= 35 && profile.getLikes().contains("movies")).collect(Collectors.toList());
    }

    public static List<Profile> instagramUsers (List<Profile> inputProfiles) {
        return inputProfiles.stream().filter(profile -> profile.getHobby().contains("cooking") || profile.getHobby().contains("photography")).collect(Collectors.toList());
    }

    public static List<Profile> boringPeople (List<Profile> profiles) {
        return profiles.stream()
                .filter(profile -> !profile.getHobby().isEmpty())
                .collect(Collectors.toList());
    }

    public static List<Integer> getAllAges(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAge).collect(Collectors.toList());
    }

    public static List<String> weUseProperCapitalizationInThisHouse(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getProfileName)
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .collect(Collectors.toList());
    }

    public static String checkForChildren (List<Profile> profiles) {
        if (profiles.stream().anyMatch(profile -> profile.getAge() < 18)) {
            return ("There are users under the age of 18!");
        } else {
            return ("There are no users under the age of 18.");
        }
    }

    public static long normalPeople (List<Profile> profiles) {
        return profiles.stream().filter(profile -> profile.getLikes().contains("music")).count();
    }

    public static String sameSameButDifferent (List<Profile> profiles) {
        if (profiles.stream().allMatch(profile -> profile.getAge() >= 18)) {
            return ("All users are of legal age.");
        } else {
            return ("Not all users are 18 or older!");
        }
    }
}
