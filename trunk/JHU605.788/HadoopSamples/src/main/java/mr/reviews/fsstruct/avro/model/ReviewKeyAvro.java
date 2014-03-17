/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package mr.reviews.fsstruct.avro.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ReviewKeyAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ReviewKeyAvro\",\"namespace\":\"mr.reviews.fsstruct.avro.model\",\"fields\":[{\"name\":\"user\",\"type\":\"string\"},{\"name\":\"keyword\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence user;
  @Deprecated public java.lang.CharSequence keyword;

  /**
   * Default constructor.
   */
  public ReviewKeyAvro() {}

  /**
   * All-args constructor.
   */
  public ReviewKeyAvro(java.lang.CharSequence user, java.lang.CharSequence keyword) {
    this.user = user;
    this.keyword = keyword;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return user;
    case 1: return keyword;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: user = (java.lang.CharSequence)value$; break;
    case 1: keyword = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'user' field.
   */
  public java.lang.CharSequence getUser() {
    return user;
  }

  /**
   * Sets the value of the 'user' field.
   * @param value the value to set.
   */
  public void setUser(java.lang.CharSequence value) {
    this.user = value;
  }

  /**
   * Gets the value of the 'keyword' field.
   */
  public java.lang.CharSequence getKeyword() {
    return keyword;
  }

  /**
   * Sets the value of the 'keyword' field.
   * @param value the value to set.
   */
  public void setKeyword(java.lang.CharSequence value) {
    this.keyword = value;
  }

  /** Creates a new ReviewKeyAvro RecordBuilder */
  public static mr.reviews.fsstruct.avro.model.ReviewKeyAvro.Builder newBuilder() {
    return new mr.reviews.fsstruct.avro.model.ReviewKeyAvro.Builder();
  }
  
  /** Creates a new ReviewKeyAvro RecordBuilder by copying an existing Builder */
  public static mr.reviews.fsstruct.avro.model.ReviewKeyAvro.Builder newBuilder(mr.reviews.fsstruct.avro.model.ReviewKeyAvro.Builder other) {
    return new mr.reviews.fsstruct.avro.model.ReviewKeyAvro.Builder(other);
  }
  
  /** Creates a new ReviewKeyAvro RecordBuilder by copying an existing ReviewKeyAvro instance */
  public static mr.reviews.fsstruct.avro.model.ReviewKeyAvro.Builder newBuilder(mr.reviews.fsstruct.avro.model.ReviewKeyAvro other) {
    return new mr.reviews.fsstruct.avro.model.ReviewKeyAvro.Builder(other);
  }
  
  /**
   * RecordBuilder for ReviewKeyAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ReviewKeyAvro>
    implements org.apache.avro.data.RecordBuilder<ReviewKeyAvro> {

    private java.lang.CharSequence user;
    private java.lang.CharSequence keyword;

    /** Creates a new Builder */
    private Builder() {
      super(mr.reviews.fsstruct.avro.model.ReviewKeyAvro.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(mr.reviews.fsstruct.avro.model.ReviewKeyAvro.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing ReviewKeyAvro instance */
    private Builder(mr.reviews.fsstruct.avro.model.ReviewKeyAvro other) {
            super(mr.reviews.fsstruct.avro.model.ReviewKeyAvro.SCHEMA$);
      if (isValidValue(fields()[0], other.user)) {
        this.user = data().deepCopy(fields()[0].schema(), other.user);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.keyword)) {
        this.keyword = data().deepCopy(fields()[1].schema(), other.keyword);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'user' field */
    public java.lang.CharSequence getUser() {
      return user;
    }
    
    /** Sets the value of the 'user' field */
    public mr.reviews.fsstruct.avro.model.ReviewKeyAvro.Builder setUser(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.user = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'user' field has been set */
    public boolean hasUser() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'user' field */
    public mr.reviews.fsstruct.avro.model.ReviewKeyAvro.Builder clearUser() {
      user = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'keyword' field */
    public java.lang.CharSequence getKeyword() {
      return keyword;
    }
    
    /** Sets the value of the 'keyword' field */
    public mr.reviews.fsstruct.avro.model.ReviewKeyAvro.Builder setKeyword(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.keyword = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'keyword' field has been set */
    public boolean hasKeyword() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'keyword' field */
    public mr.reviews.fsstruct.avro.model.ReviewKeyAvro.Builder clearKeyword() {
      keyword = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public ReviewKeyAvro build() {
      try {
        ReviewKeyAvro record = new ReviewKeyAvro();
        record.user = fieldSetFlags()[0] ? this.user : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.keyword = fieldSetFlags()[1] ? this.keyword : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}