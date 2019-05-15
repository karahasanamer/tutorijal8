package ba.unsa.etf.rs.tutorijal8;

import java.util.Objects;

public class Bus {

    String manufacturer, series;
    int seatNumber, drivers;

    public Bus() {
    }

    public Bus(String manufacturer, String series, int seatNumber, int drivers) {
        this.manufacturer = manufacturer;
        this.series = series;
        this.seatNumber = seatNumber;
        this.drivers = drivers;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getDrivers() {
        return drivers;
    }

    public void setDrivers(int drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return seatNumber == bus.seatNumber &&
                drivers == bus.drivers &&
                Objects.equals(manufacturer, bus.manufacturer) &&
                Objects.equals(series, bus.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, series, seatNumber, drivers);
    }



}
