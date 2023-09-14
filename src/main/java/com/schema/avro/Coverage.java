/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.schema.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Coverage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1886637526108938026L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Coverage\",\"namespace\":\"com.schema.avro\",\"fields\":[{\"name\":\"coverageId\",\"type\":\"long\"},{\"name\":\"coverageDescription\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"isBasicRisk\",\"type\":\"boolean\",\"default\":false},{\"name\":\"maxIndemnity\",\"type\":\"float\"},{\"name\":\"plans\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Plan\",\"fields\":[{\"name\":\"planId\",\"type\":\"long\"},{\"name\":\"planDescription\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"valuePremium\",\"type\":[\"null\",\"double\"]},{\"name\":\"factorPremium\",\"type\":[\"null\",\"double\"]}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Coverage> ENCODER =
      new BinaryMessageEncoder<Coverage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Coverage> DECODER =
      new BinaryMessageDecoder<Coverage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Coverage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Coverage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Coverage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Coverage>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Coverage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Coverage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Coverage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Coverage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long coverageId;
   private java.lang.String coverageDescription;
   private boolean isBasicRisk;
   private float maxIndemnity;
   private java.util.List<com.schema.avro.Plan> plans;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Coverage() {}

  /**
   * All-args constructor.
   * @param coverageId The new value for coverageId
   * @param coverageDescription The new value for coverageDescription
   * @param isBasicRisk The new value for isBasicRisk
   * @param maxIndemnity The new value for maxIndemnity
   * @param plans The new value for plans
   */
  public Coverage(java.lang.Long coverageId, java.lang.String coverageDescription, java.lang.Boolean isBasicRisk, java.lang.Float maxIndemnity, java.util.List<com.schema.avro.Plan> plans) {
    this.coverageId = coverageId;
    this.coverageDescription = coverageDescription;
    this.isBasicRisk = isBasicRisk;
    this.maxIndemnity = maxIndemnity;
    this.plans = plans;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return coverageId;
    case 1: return coverageDescription;
    case 2: return isBasicRisk;
    case 3: return maxIndemnity;
    case 4: return plans;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: coverageId = (java.lang.Long)value$; break;
    case 1: coverageDescription = value$ != null ? value$.toString() : null; break;
    case 2: isBasicRisk = (java.lang.Boolean)value$; break;
    case 3: maxIndemnity = (java.lang.Float)value$; break;
    case 4: plans = (java.util.List<com.schema.avro.Plan>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'coverageId' field.
   * @return The value of the 'coverageId' field.
   */
  public long getCoverageId() {
    return coverageId;
  }



  /**
   * Gets the value of the 'coverageDescription' field.
   * @return The value of the 'coverageDescription' field.
   */
  public java.lang.String getCoverageDescription() {
    return coverageDescription;
  }



  /**
   * Gets the value of the 'isBasicRisk' field.
   * @return The value of the 'isBasicRisk' field.
   */
  public boolean getIsBasicRisk() {
    return isBasicRisk;
  }



  /**
   * Gets the value of the 'maxIndemnity' field.
   * @return The value of the 'maxIndemnity' field.
   */
  public float getMaxIndemnity() {
    return maxIndemnity;
  }



  /**
   * Gets the value of the 'plans' field.
   * @return The value of the 'plans' field.
   */
  public java.util.List<com.schema.avro.Plan> getPlans() {
    return plans;
  }



  /**
   * Creates a new Coverage RecordBuilder.
   * @return A new Coverage RecordBuilder
   */
  public static com.schema.avro.Coverage.Builder newBuilder() {
    return new com.schema.avro.Coverage.Builder();
  }

  /**
   * Creates a new Coverage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Coverage RecordBuilder
   */
  public static com.schema.avro.Coverage.Builder newBuilder(com.schema.avro.Coverage.Builder other) {
    if (other == null) {
      return new com.schema.avro.Coverage.Builder();
    } else {
      return new com.schema.avro.Coverage.Builder(other);
    }
  }

  /**
   * Creates a new Coverage RecordBuilder by copying an existing Coverage instance.
   * @param other The existing instance to copy.
   * @return A new Coverage RecordBuilder
   */
  public static com.schema.avro.Coverage.Builder newBuilder(com.schema.avro.Coverage other) {
    if (other == null) {
      return new com.schema.avro.Coverage.Builder();
    } else {
      return new com.schema.avro.Coverage.Builder(other);
    }
  }

  /**
   * RecordBuilder for Coverage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Coverage>
    implements org.apache.avro.data.RecordBuilder<Coverage> {

    private long coverageId;
    private java.lang.String coverageDescription;
    private boolean isBasicRisk;
    private float maxIndemnity;
    private java.util.List<com.schema.avro.Plan> plans;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.schema.avro.Coverage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.coverageId)) {
        this.coverageId = data().deepCopy(fields()[0].schema(), other.coverageId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.coverageDescription)) {
        this.coverageDescription = data().deepCopy(fields()[1].schema(), other.coverageDescription);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.isBasicRisk)) {
        this.isBasicRisk = data().deepCopy(fields()[2].schema(), other.isBasicRisk);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.maxIndemnity)) {
        this.maxIndemnity = data().deepCopy(fields()[3].schema(), other.maxIndemnity);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.plans)) {
        this.plans = data().deepCopy(fields()[4].schema(), other.plans);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Coverage instance
     * @param other The existing instance to copy.
     */
    private Builder(com.schema.avro.Coverage other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.coverageId)) {
        this.coverageId = data().deepCopy(fields()[0].schema(), other.coverageId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.coverageDescription)) {
        this.coverageDescription = data().deepCopy(fields()[1].schema(), other.coverageDescription);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.isBasicRisk)) {
        this.isBasicRisk = data().deepCopy(fields()[2].schema(), other.isBasicRisk);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.maxIndemnity)) {
        this.maxIndemnity = data().deepCopy(fields()[3].schema(), other.maxIndemnity);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.plans)) {
        this.plans = data().deepCopy(fields()[4].schema(), other.plans);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'coverageId' field.
      * @return The value.
      */
    public long getCoverageId() {
      return coverageId;
    }


    /**
      * Sets the value of the 'coverageId' field.
      * @param value The value of 'coverageId'.
      * @return This builder.
      */
    public com.schema.avro.Coverage.Builder setCoverageId(long value) {
      validate(fields()[0], value);
      this.coverageId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'coverageId' field has been set.
      * @return True if the 'coverageId' field has been set, false otherwise.
      */
    public boolean hasCoverageId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'coverageId' field.
      * @return This builder.
      */
    public com.schema.avro.Coverage.Builder clearCoverageId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'coverageDescription' field.
      * @return The value.
      */
    public java.lang.String getCoverageDescription() {
      return coverageDescription;
    }


    /**
      * Sets the value of the 'coverageDescription' field.
      * @param value The value of 'coverageDescription'.
      * @return This builder.
      */
    public com.schema.avro.Coverage.Builder setCoverageDescription(java.lang.String value) {
      validate(fields()[1], value);
      this.coverageDescription = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'coverageDescription' field has been set.
      * @return True if the 'coverageDescription' field has been set, false otherwise.
      */
    public boolean hasCoverageDescription() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'coverageDescription' field.
      * @return This builder.
      */
    public com.schema.avro.Coverage.Builder clearCoverageDescription() {
      coverageDescription = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'isBasicRisk' field.
      * @return The value.
      */
    public boolean getIsBasicRisk() {
      return isBasicRisk;
    }


    /**
      * Sets the value of the 'isBasicRisk' field.
      * @param value The value of 'isBasicRisk'.
      * @return This builder.
      */
    public com.schema.avro.Coverage.Builder setIsBasicRisk(boolean value) {
      validate(fields()[2], value);
      this.isBasicRisk = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'isBasicRisk' field has been set.
      * @return True if the 'isBasicRisk' field has been set, false otherwise.
      */
    public boolean hasIsBasicRisk() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'isBasicRisk' field.
      * @return This builder.
      */
    public com.schema.avro.Coverage.Builder clearIsBasicRisk() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'maxIndemnity' field.
      * @return The value.
      */
    public float getMaxIndemnity() {
      return maxIndemnity;
    }


    /**
      * Sets the value of the 'maxIndemnity' field.
      * @param value The value of 'maxIndemnity'.
      * @return This builder.
      */
    public com.schema.avro.Coverage.Builder setMaxIndemnity(float value) {
      validate(fields()[3], value);
      this.maxIndemnity = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'maxIndemnity' field has been set.
      * @return True if the 'maxIndemnity' field has been set, false otherwise.
      */
    public boolean hasMaxIndemnity() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'maxIndemnity' field.
      * @return This builder.
      */
    public com.schema.avro.Coverage.Builder clearMaxIndemnity() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'plans' field.
      * @return The value.
      */
    public java.util.List<com.schema.avro.Plan> getPlans() {
      return plans;
    }


    /**
      * Sets the value of the 'plans' field.
      * @param value The value of 'plans'.
      * @return This builder.
      */
    public com.schema.avro.Coverage.Builder setPlans(java.util.List<com.schema.avro.Plan> value) {
      validate(fields()[4], value);
      this.plans = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'plans' field has been set.
      * @return True if the 'plans' field has been set, false otherwise.
      */
    public boolean hasPlans() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'plans' field.
      * @return This builder.
      */
    public com.schema.avro.Coverage.Builder clearPlans() {
      plans = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Coverage build() {
      try {
        Coverage record = new Coverage();
        record.coverageId = fieldSetFlags()[0] ? this.coverageId : (java.lang.Long) defaultValue(fields()[0]);
        record.coverageDescription = fieldSetFlags()[1] ? this.coverageDescription : (java.lang.String) defaultValue(fields()[1]);
        record.isBasicRisk = fieldSetFlags()[2] ? this.isBasicRisk : (java.lang.Boolean) defaultValue(fields()[2]);
        record.maxIndemnity = fieldSetFlags()[3] ? this.maxIndemnity : (java.lang.Float) defaultValue(fields()[3]);
        record.plans = fieldSetFlags()[4] ? this.plans : (java.util.List<com.schema.avro.Plan>) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Coverage>
    WRITER$ = (org.apache.avro.io.DatumWriter<Coverage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Coverage>
    READER$ = (org.apache.avro.io.DatumReader<Coverage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.coverageId);

    out.writeString(this.coverageDescription);

    out.writeBoolean(this.isBasicRisk);

    out.writeFloat(this.maxIndemnity);

    long size0 = this.plans.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.schema.avro.Plan e0: this.plans) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.coverageId = in.readLong();

      this.coverageDescription = in.readString();

      this.isBasicRisk = in.readBoolean();

      this.maxIndemnity = in.readFloat();

      long size0 = in.readArrayStart();
      java.util.List<com.schema.avro.Plan> a0 = this.plans;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.schema.avro.Plan>((int)size0, SCHEMA$.getField("plans").schema());
        this.plans = a0;
      } else a0.clear();
      SpecificData.Array<com.schema.avro.Plan> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.schema.avro.Plan>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.schema.avro.Plan e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.schema.avro.Plan();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.coverageId = in.readLong();
          break;

        case 1:
          this.coverageDescription = in.readString();
          break;

        case 2:
          this.isBasicRisk = in.readBoolean();
          break;

        case 3:
          this.maxIndemnity = in.readFloat();
          break;

        case 4:
          long size0 = in.readArrayStart();
          java.util.List<com.schema.avro.Plan> a0 = this.plans;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.schema.avro.Plan>((int)size0, SCHEMA$.getField("plans").schema());
            this.plans = a0;
          } else a0.clear();
          SpecificData.Array<com.schema.avro.Plan> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.schema.avro.Plan>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.schema.avro.Plan e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.schema.avro.Plan();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










