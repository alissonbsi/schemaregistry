/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.registry.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class RecordPoc extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -286243054594684557L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RecordPoc\",\"namespace\":\"com.registry.avro\",\"fields\":[{\"name\":\"raw\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Product\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Nome do Produto\"},{\"name\":\"valor\",\"type\":\"double\",\"doc\":\"Valor do Produto\"}],\"version\":\"1\"},{\"type\":\"record\",\"name\":\"BusinessRule\",\"namespace\":\"com.registry.avro.business\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Nome da regra\"},{\"name\":\"role\",\"type\":{\"type\":\"enum\",\"name\":\"Role\",\"symbols\":[\"ADMIN\",\"USER\",\"MANAGER\"]},\"doc\":\"Regra\"}]}]},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Tipo do Record\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RecordPoc> ENCODER =
      new BinaryMessageEncoder<RecordPoc>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RecordPoc> DECODER =
      new BinaryMessageDecoder<RecordPoc>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RecordPoc> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RecordPoc> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RecordPoc> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RecordPoc>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RecordPoc to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RecordPoc from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RecordPoc instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RecordPoc fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.Object raw;
  /** Tipo do Record */
   private java.lang.String type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RecordPoc() {}

  /**
   * All-args constructor.
   * @param raw The new value for raw
   * @param type Tipo do Record
   */
  public RecordPoc(java.lang.Object raw, java.lang.String type) {
    this.raw = raw;
    this.type = type;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return raw;
    case 1: return type;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: raw = value$; break;
    case 1: type = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'raw' field.
   * @return The value of the 'raw' field.
   */
  public java.lang.Object getRaw() {
    return raw;
  }



  /**
   * Gets the value of the 'type' field.
   * @return Tipo do Record
   */
  public java.lang.String getType() {
    return type;
  }



  /**
   * Creates a new RecordPoc RecordBuilder.
   * @return A new RecordPoc RecordBuilder
   */
  public static com.registry.avro.RecordPoc.Builder newBuilder() {
    return new com.registry.avro.RecordPoc.Builder();
  }

  /**
   * Creates a new RecordPoc RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RecordPoc RecordBuilder
   */
  public static com.registry.avro.RecordPoc.Builder newBuilder(com.registry.avro.RecordPoc.Builder other) {
    if (other == null) {
      return new com.registry.avro.RecordPoc.Builder();
    } else {
      return new com.registry.avro.RecordPoc.Builder(other);
    }
  }

  /**
   * Creates a new RecordPoc RecordBuilder by copying an existing RecordPoc instance.
   * @param other The existing instance to copy.
   * @return A new RecordPoc RecordBuilder
   */
  public static com.registry.avro.RecordPoc.Builder newBuilder(com.registry.avro.RecordPoc other) {
    if (other == null) {
      return new com.registry.avro.RecordPoc.Builder();
    } else {
      return new com.registry.avro.RecordPoc.Builder(other);
    }
  }

  /**
   * RecordBuilder for RecordPoc instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RecordPoc>
    implements org.apache.avro.data.RecordBuilder<RecordPoc> {

    private java.lang.Object raw;
    /** Tipo do Record */
    private java.lang.String type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.registry.avro.RecordPoc.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.raw)) {
        this.raw = data().deepCopy(fields()[0].schema(), other.raw);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing RecordPoc instance
     * @param other The existing instance to copy.
     */
    private Builder(com.registry.avro.RecordPoc other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.raw)) {
        this.raw = data().deepCopy(fields()[0].schema(), other.raw);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'raw' field.
      * @return The value.
      */
    public java.lang.Object getRaw() {
      return raw;
    }


    /**
      * Sets the value of the 'raw' field.
      * @param value The value of 'raw'.
      * @return This builder.
      */
    public com.registry.avro.RecordPoc.Builder setRaw(java.lang.Object value) {
      validate(fields()[0], value);
      this.raw = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'raw' field has been set.
      * @return True if the 'raw' field has been set, false otherwise.
      */
    public boolean hasRaw() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'raw' field.
      * @return This builder.
      */
    public com.registry.avro.RecordPoc.Builder clearRaw() {
      raw = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * Tipo do Record
      * @return The value.
      */
    public java.lang.String getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * Tipo do Record
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.registry.avro.RecordPoc.Builder setType(java.lang.String value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * Tipo do Record
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * Tipo do Record
      * @return This builder.
      */
    public com.registry.avro.RecordPoc.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RecordPoc build() {
      try {
        RecordPoc record = new RecordPoc();
        record.raw = fieldSetFlags()[0] ? this.raw :  defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RecordPoc>
    WRITER$ = (org.apache.avro.io.DatumWriter<RecordPoc>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RecordPoc>
    READER$ = (org.apache.avro.io.DatumReader<RecordPoc>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










