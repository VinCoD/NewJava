package vin;

public class bill {
    double charge;
    double totalCharge;

    public bill() {
    }

    public double getCharge() {
        if (MyFrame.check.isSelected()) {
            if (MyFrame.panel.isDay().equals("DayTime")) {
                this.charge = (double)MyFrame.panel.getDuration() * 0.06666666666666667D;
            } else {
                this.charge = (double)MyFrame.panel.getDuration() * 0.05D;
            }

            return this.charge;
        } else {
            this.charge = (double)MyFrame.panel.getDuration() * 0.08333333333333333D;
            return this.charge;
        }
    }

    public double getTotalCharge() {
        this.totalCharge = this.getVAT() + this.getCharge();
        this.totalCharge = (double)Math.round(this.totalCharge * 100.0D) / 100.0D;
        return this.totalCharge;
    }

    public double getVAT() {
        double VAT;
        if (MyFrame.panel.getDuration() > 120) {
            VAT = this.getCharge() * 0.16D;
            VAT = (double)Math.round(VAT * 100.0D) / 100.0D;
            return VAT;
        } else {
            VAT = 0.0D;
            return VAT;
        }
    }
}

