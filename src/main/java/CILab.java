public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        final int length = getString().length();
        if (length <= 1) {
            return true;
        }
        final boolean isFirstLetterCapital = Character.isUpperCase(getString().charAt(0));
        if (isFirstLetterCapital) {
            if (Character.isUpperCase(getString().charAt(1))) {
                return getString().chars().allMatch(Character::isUpperCase);
            } else {
                return getString().chars().skip(1).allMatch(Character::isLowerCase);
            }
        } else {
            return getString().chars().allMatch(Character::isLowerCase);
        }
    }

}

