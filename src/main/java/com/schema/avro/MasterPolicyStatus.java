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
public class MasterPolicyStatus extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4465408442470532952L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MasterPolicyStatus\",\"namespace\":\"com.schema.avro\",\"fields\":[{\"name\":\"statusId\",\"type\":\"int\"},{\"name\":\"status\",\"type\":{\"type\":\"enum\",\"name\":\"Status\",\"symbols\":[\"ATIVO\",\"CANCELADO\",\"NAO_EFETIVADO\",\"EM_NEGOCIACAO\",\"PEND_ATIVACAO\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MasterPolicyStatus> ENCODER =
      new BinaryMessageEncoder<MasterPolicyStatus>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MasterPolicyStatus> DECODER =
      new BinaryMessageDecoder<MasterPolicyStatus>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<MasterPolicyStatus> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<MasterPolicyStatus> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<MasterPolicyStatus> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MasterPolicyStatus>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this MasterPolicyStatus to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a MasterPolicyStatus from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a MasterPolicyStatus instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static MasterPolicyStatus fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int statusId;
   private com.schema.avro.Status status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MasterPolicyStatus() {}

  /**
   * All-args constructor.
   * @param statusId The new value for statusId
   * @param status The new value for status
   */
  public MasterPolicyStatus(java.lang.Integer statusId, com.schema.avro.Status status) {
    this.statusId = statusId;
    this.status = status;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return statusId;
    case 1: return status;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: statusId = (java.lang.Integer)value$; break;
    case 1: status = (com.schema.avro.Status)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'statusId' field.
   * @return The value of the 'statusId' field.
   */
  public int getStatusId() {
    return statusId;
  }



  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public com.schema.avro.Status getStatus() {
    return status;
  }



  /**
   * Creates a new MasterPolicyStatus RecordBuilder.
   * @return A new MasterPolicyStatus RecordBuilder
   */
  public static com.schema.avro.MasterPolicyStatus.Builder newBuilder() {
    return new com.schema.avro.MasterPolicyStatus.Builder();
  }

  /**
   * Creates a new MasterPolicyStatus RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MasterPolicyStatus RecordBuilder
   */
  public static com.schema.avro.MasterPolicyStatus.Builder newBuilder(com.schema.avro.MasterPolicyStatus.Builder other) {
    if (other == null) {
      return new com.schema.avro.MasterPolicyStatus.Builder();
    } else {
      return new com.schema.avro.MasterPolicyStatus.Builder(other);
    }
  }

  /**
   * Creates a new MasterPolicyStatus RecordBuilder by copying an existing MasterPolicyStatus instance.
   * @param other The existing instance to copy.
   * @return A new MasterPolicyStatus RecordBuilder
   */
  public static com.schema.avro.MasterPolicyStatus.Builder newBuilder(com.schema.avro.MasterPolicyStatus other) {
    if (other == null) {
      return new com.schema.avro.MasterPolicyStatus.Builder();
    } else {
      return new com.schema.avro.MasterPolicyStatus.Builder(other);
    }
  }

  /**
   * RecordBuilder for MasterPolicyStatus instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MasterPolicyStatus>
    implements org.apache.avro.data.RecordBuilder<MasterPolicyStatus> {

    private int statusId;
    private com.schema.avro.Status status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.schema.avro.MasterPolicyStatus.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.statusId)) {
        this.statusId = data().deepCopy(fields()[0].schema(), other.statusId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing MasterPolicyStatus instance
     * @param other The existing instance to copy.
     */
    private Builder(com.schema.avro.MasterPolicyStatus other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.statusId)) {
        this.statusId = data().deepCopy(fields()[0].schema(), other.statusId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'statusId' field.
      * @return The value.
      */
    public int getStatusId() {
      return statusId;
    }


    /**
      * Sets the value of the 'statusId' field.
      * @param value The value of 'statusId'.
      * @return This builder.
      */
    public com.schema.avro.MasterPolicyStatus.Builder setStatusId(int value) {
      validate(fields()[0], value);
      this.statusId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'statusId' field has been set.
      * @return True if the 'statusId' field has been set, false otherwise.
      */
    public boolean hasStatusId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'statusId' field.
      * @return This builder.
      */
    public com.schema.avro.MasterPolicyStatus.Builder clearStatusId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public com.schema.avro.Status getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.schema.avro.MasterPolicyStatus.Builder setStatus(com.schema.avro.Status value) {
      validate(fields()[1], value);
      this.status = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.schema.avro.MasterPolicyStatus.Builder clearStatus() {
      status = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MasterPolicyStatus build() {
      try {
        MasterPolicyStatus record = new MasterPolicyStatus();
        record.statusId = fieldSetFlags()[0] ? this.statusId : (java.lang.Integer) defaultValue(fields()[0]);
        record.status = fieldSetFlags()[1] ? this.status : (com.schema.avro.Status) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MasterPolicyStatus>
    WRITER$ = (org.apache.avro.io.DatumWriter<MasterPolicyStatus>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MasterPolicyStatus>
    READER$ = (org.apache.avro.io.DatumReader<MasterPolicyStatus>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.statusId);

    out.writeEnum(this.status.ordinal());

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.statusId = in.readInt();

      this.status = com.schema.avro.Status.values()[in.readEnum()];

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.statusId = in.readInt();
          break;

        case 1:
          this.status = com.schema.avro.Status.values()[in.readEnum()];
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










