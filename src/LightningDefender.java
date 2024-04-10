public class LightningDefender {

    private String name;
    private int energyLevel;
    private int power;
    private int shieldStrength;
    private boolean status;

    public LightningDefender (String name, int energyLevel, int power, int shieldStrength, boolean status) {
        this.name = name;
        this.energyLevel = energyLevel;
        this.power = power;
        this.shieldStrength = shieldStrength;
        this.status = status;
    }

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void shieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void reportStatus() {
        System.out.println("LIGHTNING DEFENDER INFORMATION ");
        System.out.println("NAME: " + name);
        System.out.println("ENERGY LEVEL: " + energyLevel);
        System.out.println("POWER: " + power);
        System.out.println("SHIELD STRENGTH: " + shieldStrength);
        System.out.println("STATUS: " + status);
        System.out.println();
    }

    public void attack(LightningDefender attacked) {
        int damage = (getPower()/attacked.getShieldStrength());
        attacked.setEnergyLevel(attacked.getEnergyLevel() - damage);
        System.out.println(attacked.getName() + " got attacked by " + getName() + "!");
        System.out.println(attacked.getName() + " has a new energy levle of " + attacked.getEnergyLevel());
    }



    public static void main(String[] args) {
        LightningDefender fastest = new LightningDefender("McQueen", 100, 100, 110, false);

        LightningDefender slowest = new LightningDefender("Luigi", 70, 60, 55,true);

        LightningDefender enemy = new LightningDefender("Ramone", 95, 100, 100, false);

        fastest.reportStatus();
        slowest.reportStatus();
        enemy.reportStatus();

        fastest.attack(enemy);

    }
}
