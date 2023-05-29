//problem: https://leetcode.com/problems/design-parking-system/description/

class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean checkCarBig() {
        if (big >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCarMed() {
        if (medium >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCarSmall() {
        if (small >= 1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean addCarBig() {
        if (checkCarBig()) {
            this.big--;
            return true;
        } else {
            return false;
        }
    }

    private boolean addCarMed() {
        if (checkCarMed()) {
            this.medium--;
            return true;
        } else {
            return false;
        }
    }

    private boolean addCarSmall() {
        if (checkCarSmall()) {
            this.small--;
            return true;
        } else {
            return false;
        }
    }

    public boolean addCar(int carType) {
        if (carType > 0) {
            switch (carType) {
                case 1:
                    return addCarBig();
                case 2:
                    return addCarMed();
                case 3:
                    return addCarSmall();
            }
        }
        return false;
    }
}
