package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {
    public Animal() {


    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {

    }

    public Long getId() {
       return getId();
    }

    public void setId(Long id) {

    }

    public Person getOwner() {
       return getOwner();
    }

    public static String toString(long i, int radix) {
        return Long.toString(i, radix);
    }

    public static String toUnsignedString(long i, int radix) {
        return Long.toUnsignedString(i, radix);
    }

    public static String toHexString(long i) {
        return Long.toHexString(i);
    }

    public static String toOctalString(long i) {
        return Long.toOctalString(i);
    }

    public static String toBinaryString(long i) {
        return Long.toBinaryString(i);
    }

    public static String toString(long i) {
        return Long.toString(i);
    }

    public static String toUnsignedString(long i) {
        return Long.toUnsignedString(i);
    }

    public static long parseLong(String s, int radix) throws NumberFormatException {
        return Long.parseLong(s, radix);
    }

    public static long parseLong(String s) throws NumberFormatException {
        return Long.parseLong(s);
    }

    public static long parseUnsignedLong(String s, int radix) throws NumberFormatException {
        return Long.parseUnsignedLong(s, radix);
    }

    public static long parseUnsignedLong(String s) throws NumberFormatException {
        return Long.parseUnsignedLong(s);
    }

    public static Long valueOf(String s, int radix) throws NumberFormatException {
        return Long.valueOf(s, radix);
    }

    public static Long valueOf(String s) throws NumberFormatException {
        return Long.valueOf(s);
    }

    public static Long valueOf(long l) {
        return Long.valueOf(l);
    }

    public static Long decode(String nm) throws NumberFormatException {
        return Long.decode(nm);
    }

    public byte byteValue() {
        return getId().byteValue();
    }

    public short shortValue() {
        return getId().shortValue();
    }

    public int intValue() {
        return getId().intValue();
    }

    public long longValue() {
        return getId().longValue();
    }

    public float floatValue() {
        return getId().floatValue();
    }

    public double doubleValue() {
        return getId().doubleValue();
    }

    public static int hashCode(long value) {
        return Long.hashCode(value);
    }

    public static Long getLong(String nm) {
        return Long.getLong(nm);
    }

    public static Long getLong(String nm, long val) {
        return Long.getLong(nm, val);
    }

    public static Long getLong(String nm, Long val) {
        return Long.getLong(nm, val);
    }

    public int compareTo(Long anotherLong) {
        return getId().compareTo(anotherLong);
    }

    public static int compare(long x, long y) {
        return Long.compare(x, y);
    }

    public static int compareUnsigned(long x, long y) {
        return Long.compareUnsigned(x, y);
    }

    public static long divideUnsigned(long dividend, long divisor) {
        return Long.divideUnsigned(dividend, divisor);
    }

    public static long remainderUnsigned(long dividend, long divisor) {
        return Long.remainderUnsigned(dividend, divisor);
    }

    public static long highestOneBit(long i) {
        return Long.highestOneBit(i);
    }

    public static long lowestOneBit(long i) {
        return Long.lowestOneBit(i);
    }

    public static int numberOfLeadingZeros(long i) {
        return Long.numberOfLeadingZeros(i);
    }

    public static int numberOfTrailingZeros(long i) {
        return Long.numberOfTrailingZeros(i);
    }

    public static int bitCount(long i) {
        return Long.bitCount(i);
    }

    public static long rotateLeft(long i, int distance) {
        return Long.rotateLeft(i, distance);
    }

    public static long rotateRight(long i, int distance) {
        return Long.rotateRight(i, distance);
    }

    public static long reverse(long i) {
        return Long.reverse(i);
    }

    public static int signum(long i) {
        return Long.signum(i);
    }

    public static long reverseBytes(long i) {
        return Long.reverseBytes(i);
    }

    public static long sum(long a, long b) {
        return Long.sum(a, b);
    }

    public static long max(long a, long b) {
        return Long.max(a, b);
    }

    public static long min(long a, long b) {
        return Long.min(a, b);
    }

    public void setOwner(Person owner) {


    }

    public Address getAddress() {
        return null;
    }
}
