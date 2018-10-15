class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int divisor = 10;
		int result = 0, countOfNumberOfDigits = 0, remainder;
		int duplicateNumber = numberToCheck;

		while(duplicateNumber!=0) {
			duplicateNumber = duplicateNumber/divisor;
			++countOfNumberOfDigits;
		}

		duplicateNumber = numberToCheck;

		while(duplicateNumber!=0) {
			remainder = duplicateNumber%divisor;
			result = (int) (result+Math.pow(remainder,countOfNumberOfDigits));
			duplicateNumber = duplicateNumber/10;
		}

		if(result==numberToCheck) {
			return true;
		} else {
			return false;
		}
	}

}
