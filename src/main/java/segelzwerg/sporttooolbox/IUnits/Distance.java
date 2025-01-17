package segelzwerg.sporttooolbox.IUnits;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Distance {
    private final float kilometer;
    private final float meter;

    public Distance(float kilometer) {
        this(kilometer, 0);
    }

    public Distance(float kilometer, float meter) {
        this.kilometer = kilometer + (int) meter / 1000;
        this.meter = meter % 1000;
    }


    public Distance addDistance(Distance toAdd)
    {
        float kilometer= this.kilometer + toAdd.kilometer;
        float meter= this.meter+toAdd.meter;

        return new Distance(kilometer, meter);
    }
    public Speed computeSpeed(Time time) {
        return time.computeSpeed(kilometer, meter);
    }
}
