

public class SpeedingPoints {
    //this is a field that is called speedingpoint that is going to be used later on in this program
    private int speedingPoints;
//this is getter of the field
    public int getSpeedingPoints() {
        return speedingPoints;
    }
//this is the setter of the field
    public void setSpeedingPoints(int speedingPoints) {
        this.speedingPoints = speedingPoints;
    }

    //this is the constructor for the field and setting the speedingpoint to 0
    public SpeedingPoints() {
        speedingPoints = 0;
    }





//this is a boolean method to check up for the tolerance speed camera
    public boolean checkTolerance(double speed, int limit) {
        //Complete this method
        boolean checkTolerance = false;
        if (speed < (limit * 0.1 + 2)) {
            return true;
        }
        return checkTolerance;
    }
//this method helps in checking the speed limit and the speed and according to it's calculations it will decide what should the driver take speedingpoints.
    public int checkPoints(double speed, int limit) {
        //Complete this method
        boolean toleranceok = checkTolerance(speed, limit);
        if (!toleranceok) {
            if (limit == 20) {
                if (speed >= 21 && speed <= 30) {
                    speedingPoints = 3;
                } else if (speed >= 31 && speed <= 40) {
                     speedingPoints = 4;
                } else if (speed >= 41) {
                    speedingPoints = 6;
                }
            }
            if (limit == 30) {
                if (speed >= 31 && speed <= 40) {
                    speedingPoints = 3;
                } else if (speed >= 41 && speed <= 50) {
                    speedingPoints = 4;
                } else if (speed >= 51) {
                    speedingPoints = 6;
                }
            }
                if (limit == 40) {
                    if (speed >= 41 && speed <= 55) {
                        speedingPoints = 3;
                    } else if (speed >= 55 && speed <= 65) {
                        speedingPoints = 4;
                    } else if (speed >= 66) {
                        speedingPoints = 6;
                    }
                }
                    if (limit == 50) {
                        if (speed >= 51 && speed <= 65) {
                            speedingPoints = 3;
                        } else if (speed >= 66 && speed <= 75) {
                            speedingPoints = 4;
                        } else if (speed >= 76) {
                            speedingPoints = 6;
                        }
                    }
                        if (limit == 60) {
                            if (speed >= 61 && speed <= 80) {
                                speedingPoints = 3;
                            } else if (speed >= 81 && speed <=90 ) {
                                speedingPoints = 4;
                            } else if (speed >= 91) {
                                speedingPoints = 6;
                            }
                        }
                        if (limit == 70){
                            if (speed >= 71 && speed <= 90) {
                                speedingPoints = 3;
                            } else if (speed >= 91&& speed <= 100) {
                                speedingPoints = 4;
                            } else if (speed >= 101) {
                                speedingPoints = 6;
                            }
                        }
                }
        return 5;
    }
    //while this method helps us to show the outcome in a combination between numbers and words that is why it is a String
    public String getOutcomeStr(double speed, int speedlimit) {
        //Complete this method
        String message = "";
        System.out.println("Speed was " + speed + " limit was " + speedlimit + " number of points " + speedingPoints);

        return message;
    }


}
