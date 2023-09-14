/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.cardif.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Product extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7998133791174601380L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Product\",\"namespace\":\"com.cardif.avro\",\"fields\":[{\"name\":\"productId\",\"type\":\"int\"},{\"name\":\"productDescription\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"group\",\"type\":{\"type\":\"record\",\"name\":\"Group\",\"fields\":[{\"name\":\"groupId\",\"type\":\"int\"},{\"name\":\"groupDescription\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lineBusiness\",\"type\":{\"type\":\"record\",\"name\":\"LineBusiness\",\"fields\":[{\"name\":\"lineBusinessId\",\"type\":\"int\"},{\"name\":\"lineBusinessName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Product> ENCODER =
      new BinaryMessageEncoder<Product>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Product> DECODER =
      new BinaryMessageDecoder<Product>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Product> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Product> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Product> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Product>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Product to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Product from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Product instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Product fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int productId;
   private java.lang.String productDescription;
   private com.cardif.avro.Group group;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Product() {}

  /**
   * All-args constructor.
   * @param productId The new value for productId
   * @param productDescription The new value for productDescription
   * @param group The new value for group
   */
  public Product(java.lang.Integer productId, java.lang.String productDescription, com.cardif.avro.Group group) {
    this.productId = productId;
    this.productDescription = productDescription;
    this.group = group;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return productId;
    case 1: return productDescription;
    case 2: return group;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: productId = (java.lang.Integer)value$; break;
    case 1: productDescription = value$ != null ? value$.toString() : null; break;
    case 2: group = (com.cardif.avro.Group)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'productId' field.
   * @return The value of the 'productId' field.
   */
  public int getProductId() {
    return productId;
  }



  /**
   * Gets the value of the 'productDescription' field.
   * @return The value of the 'productDescription' field.
   */
  public java.lang.String getProductDescription() {
    return productDescription;
  }



  /**
   * Gets the value of the 'group' field.
   * @return The value of the 'group' field.
   */
  public com.cardif.avro.Group getGroup() {
    return group;
  }



  /**
   * Creates a new Product RecordBuilder.
   * @return A new Product RecordBuilder
   */
  public static com.cardif.avro.Product.Builder newBuilder() {
    return new com.cardif.avro.Product.Builder();
  }

  /**
   * Creates a new Product RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Product RecordBuilder
   */
  public static com.cardif.avro.Product.Builder newBuilder(com.cardif.avro.Product.Builder other) {
    if (other == null) {
      return new com.cardif.avro.Product.Builder();
    } else {
      return new com.cardif.avro.Product.Builder(other);
    }
  }

  /**
   * Creates a new Product RecordBuilder by copying an existing Product instance.
   * @param other The existing instance to copy.
   * @return A new Product RecordBuilder
   */
  public static com.cardif.avro.Product.Builder newBuilder(com.cardif.avro.Product other) {
    if (other == null) {
      return new com.cardif.avro.Product.Builder();
    } else {
      return new com.cardif.avro.Product.Builder(other);
    }
  }

  /**
   * RecordBuilder for Product instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Product>
    implements org.apache.avro.data.RecordBuilder<Product> {

    private int productId;
    private java.lang.String productDescription;
    private com.cardif.avro.Group group;
    private com.cardif.avro.Group.Builder groupBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.cardif.avro.Product.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.productId)) {
        this.productId = data().deepCopy(fields()[0].schema(), other.productId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.productDescription)) {
        this.productDescription = data().deepCopy(fields()[1].schema(), other.productDescription);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.group)) {
        this.group = data().deepCopy(fields()[2].schema(), other.group);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasGroupBuilder()) {
        this.groupBuilder = com.cardif.avro.Group.newBuilder(other.getGroupBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Product instance
     * @param other The existing instance to copy.
     */
    private Builder(com.cardif.avro.Product other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.productId)) {
        this.productId = data().deepCopy(fields()[0].schema(), other.productId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.productDescription)) {
        this.productDescription = data().deepCopy(fields()[1].schema(), other.productDescription);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.group)) {
        this.group = data().deepCopy(fields()[2].schema(), other.group);
        fieldSetFlags()[2] = true;
      }
      this.groupBuilder = null;
    }

    /**
      * Gets the value of the 'productId' field.
      * @return The value.
      */
    public int getProductId() {
      return productId;
    }


    /**
      * Sets the value of the 'productId' field.
      * @param value The value of 'productId'.
      * @return This builder.
      */
    public com.cardif.avro.Product.Builder setProductId(int value) {
      validate(fields()[0], value);
      this.productId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'productId' field has been set.
      * @return True if the 'productId' field has been set, false otherwise.
      */
    public boolean hasProductId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'productId' field.
      * @return This builder.
      */
    public com.cardif.avro.Product.Builder clearProductId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'productDescription' field.
      * @return The value.
      */
    public java.lang.String getProductDescription() {
      return productDescription;
    }


    /**
      * Sets the value of the 'productDescription' field.
      * @param value The value of 'productDescription'.
      * @return This builder.
      */
    public com.cardif.avro.Product.Builder setProductDescription(java.lang.String value) {
      validate(fields()[1], value);
      this.productDescription = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'productDescription' field has been set.
      * @return True if the 'productDescription' field has been set, false otherwise.
      */
    public boolean hasProductDescription() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'productDescription' field.
      * @return This builder.
      */
    public com.cardif.avro.Product.Builder clearProductDescription() {
      productDescription = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'group' field.
      * @return The value.
      */
    public com.cardif.avro.Group getGroup() {
      return group;
    }


    /**
      * Sets the value of the 'group' field.
      * @param value The value of 'group'.
      * @return This builder.
      */
    public com.cardif.avro.Product.Builder setGroup(com.cardif.avro.Group value) {
      validate(fields()[2], value);
      this.groupBuilder = null;
      this.group = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'group' field has been set.
      * @return True if the 'group' field has been set, false otherwise.
      */
    public boolean hasGroup() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'group' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.cardif.avro.Group.Builder getGroupBuilder() {
      if (groupBuilder == null) {
        if (hasGroup()) {
          setGroupBuilder(com.cardif.avro.Group.newBuilder(group));
        } else {
          setGroupBuilder(com.cardif.avro.Group.newBuilder());
        }
      }
      return groupBuilder;
    }

    /**
     * Sets the Builder instance for the 'group' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.cardif.avro.Product.Builder setGroupBuilder(com.cardif.avro.Group.Builder value) {
      clearGroup();
      groupBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'group' field has an active Builder instance
     * @return True if the 'group' field has an active Builder instance
     */
    public boolean hasGroupBuilder() {
      return groupBuilder != null;
    }

    /**
      * Clears the value of the 'group' field.
      * @return This builder.
      */
    public com.cardif.avro.Product.Builder clearGroup() {
      group = null;
      groupBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Product build() {
      try {
        Product record = new Product();
        record.productId = fieldSetFlags()[0] ? this.productId : (java.lang.Integer) defaultValue(fields()[0]);
        record.productDescription = fieldSetFlags()[1] ? this.productDescription : (java.lang.String) defaultValue(fields()[1]);
        if (groupBuilder != null) {
          try {
            record.group = this.groupBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("group"));
            throw e;
          }
        } else {
          record.group = fieldSetFlags()[2] ? this.group : (com.cardif.avro.Group) defaultValue(fields()[2]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Product>
    WRITER$ = (org.apache.avro.io.DatumWriter<Product>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Product>
    READER$ = (org.apache.avro.io.DatumReader<Product>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.productId);

    out.writeString(this.productDescription);

    this.group.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.productId = in.readInt();

      this.productDescription = in.readString();

      if (this.group == null) {
        this.group = new com.cardif.avro.Group();
      }
      this.group.customDecode(in);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.productId = in.readInt();
          break;

        case 1:
          this.productDescription = in.readString();
          break;

        case 2:
          if (this.group == null) {
            this.group = new com.cardif.avro.Group();
          }
          this.group.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









