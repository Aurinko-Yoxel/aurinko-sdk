/*
 * Aurinko.io API
 * ## Introduction The Aurinko API is a unified API platform allowing developers to quickly build integrations with many mailbox providers and services like Google, Office 365, Outlook.com, MS Exchange, IMAP. The unified API abstracts away differences between many email, calendar, contact, task APIs to make it easy to connect and sync the mailbox data.  The Aurinko API's focus is convenient and reliable data synchronization for all supported data categories (email, calendar, contacts, tasks) so the API provides methods to receive changes/deltas and be notified of the changes (through webhooks) in a unified manner. The API's sync/deltas model should allow developers to build reliable event based solutions easily.  The Aurinko API is built on HTTP. Our API is RESTful. It has predictable resource URLs. It returns HTTP response codes to indicate errors. It also accepts and returns JSON in the HTTP body.  ## API Authentication When you [sign up for an account](https://app.aurinko.io/#/signUp), you are given a Client Id and Secret for every application that you create. You use those to go through OAuth flows that allow you to start syncing remote account data through Aurinko. An account OAuth flow can be started with just the Client Id and the Client Secret will be required to obtain an account access token in the \"authorization code\" flow (\"implicit grant\" flow does is secured by the \"trusted domains\" setting).  Aurinko offers two forms of authentication:  - `Basic <Client Id, Client Secret>` - used for authentication flows and administrative requests made from the server side. - `Bearer <Account Access Token>` - used for working with an account data. - `Api Key in Cookie` - for in-browser apps that use Aurinko as their backend API with user sessions. - `Api Key in Header (X-Aurinko-Session)` - for server side apps that need user sessions  Never share your client secret or access token. Keep them guarded and secure.  ## Getting Started Guide If you have a use case you would like to implement, please consult us for feedback on the best API operations for the task.  [Click here to visit our API Guides](https://docs.aurinko.io/ctg-getting-started/getting-started). 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@aurinko.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.aurinko.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.aurinko.client.model.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RecurrenceSimplePattern
 */
@JsonPropertyOrder({
  RecurrenceSimplePattern.JSON_PROPERTY_FREQUENCY,
  RecurrenceSimplePattern.JSON_PROPERTY_INTERVAL,
  RecurrenceSimplePattern.JSON_PROPERTY_DAYS_OF_WEEK,
  RecurrenceSimplePattern.JSON_PROPERTY_WEEK_START,
  RecurrenceSimplePattern.JSON_PROPERTY_DAY_OF_MONTH,
  RecurrenceSimplePattern.JSON_PROPERTY_MONTH_OF_YEAR,
  RecurrenceSimplePattern.JSON_PROPERTY_INSTANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecurrenceSimplePattern {
  /**
   * Gets or Sets frequency
   */
  public enum FrequencyEnum {
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    MONTHLYRELATIVE("monthlyRelative"),
    
    YEARLY("yearly"),
    
    YEARLYRELATIVE("yearlyRelative"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private FrequencyEnum frequency;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Integer interval = 1;

  public static final String JSON_PROPERTY_DAYS_OF_WEEK = "daysOfWeek";
  private List<DayOfWeek> daysOfWeek;

  /**
   * Gets or Sets weekStart
   */
  public enum WeekStartEnum {
    MONDAY("monday"),
    
    SUNDAY("sunday"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    WeekStartEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WeekStartEnum fromValue(String value) {
      for (WeekStartEnum b : WeekStartEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_WEEK_START = "weekStart";
  private WeekStartEnum weekStart;

  public static final String JSON_PROPERTY_DAY_OF_MONTH = "dayOfMonth";
  private Integer dayOfMonth;

  public static final String JSON_PROPERTY_MONTH_OF_YEAR = "monthOfYear";
  private Integer monthOfYear;

  /**
   * Gets or Sets instance
   */
  public enum InstanceEnum {
    FIRST("first"),
    
    SECOND("second"),
    
    THIRD("third"),
    
    FOURTH("fourth"),
    
    LAST("last"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    InstanceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstanceEnum fromValue(String value) {
      for (InstanceEnum b : InstanceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_INSTANCE = "instance";
  private InstanceEnum instance;

  public RecurrenceSimplePattern() { 
  }

  public RecurrenceSimplePattern frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public RecurrenceSimplePattern interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  public RecurrenceSimplePattern daysOfWeek(List<DayOfWeek> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public RecurrenceSimplePattern addDaysOfWeekItem(DayOfWeek daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

   /**
   * Get daysOfWeek
   * @return daysOfWeek
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAYS_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DayOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }


  @JsonProperty(JSON_PROPERTY_DAYS_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDaysOfWeek(List<DayOfWeek> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }


  public RecurrenceSimplePattern weekStart(WeekStartEnum weekStart) {
    this.weekStart = weekStart;
    return this;
  }

   /**
   * Get weekStart
   * @return weekStart
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEEK_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WeekStartEnum getWeekStart() {
    return weekStart;
  }


  @JsonProperty(JSON_PROPERTY_WEEK_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeekStart(WeekStartEnum weekStart) {
    this.weekStart = weekStart;
  }


  public RecurrenceSimplePattern dayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

   /**
   * Get dayOfMonth
   * minimum: 1
   * maximum: 31
   * @return dayOfMonth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAY_OF_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDayOfMonth() {
    return dayOfMonth;
  }


  @JsonProperty(JSON_PROPERTY_DAY_OF_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }


  public RecurrenceSimplePattern monthOfYear(Integer monthOfYear) {
    this.monthOfYear = monthOfYear;
    return this;
  }

   /**
   * Get monthOfYear
   * minimum: 1
   * maximum: 12
   * @return monthOfYear
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTH_OF_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMonthOfYear() {
    return monthOfYear;
  }


  @JsonProperty(JSON_PROPERTY_MONTH_OF_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthOfYear(Integer monthOfYear) {
    this.monthOfYear = monthOfYear;
  }


  public RecurrenceSimplePattern instance(InstanceEnum instance) {
    this.instance = instance;
    return this;
  }

   /**
   * Get instance
   * @return instance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InstanceEnum getInstance() {
    return instance;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstance(InstanceEnum instance) {
    this.instance = instance;
  }


  /**
   * Return true if this Recurrence_simple_pattern object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurrenceSimplePattern recurrenceSimplePattern = (RecurrenceSimplePattern) o;
    return Objects.equals(this.frequency, recurrenceSimplePattern.frequency) &&
        Objects.equals(this.interval, recurrenceSimplePattern.interval) &&
        Objects.equals(this.daysOfWeek, recurrenceSimplePattern.daysOfWeek) &&
        Objects.equals(this.weekStart, recurrenceSimplePattern.weekStart) &&
        Objects.equals(this.dayOfMonth, recurrenceSimplePattern.dayOfMonth) &&
        Objects.equals(this.monthOfYear, recurrenceSimplePattern.monthOfYear) &&
        Objects.equals(this.instance, recurrenceSimplePattern.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, interval, daysOfWeek, weekStart, dayOfMonth, monthOfYear, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurrenceSimplePattern {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    weekStart: ").append(toIndentedString(weekStart)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    monthOfYear: ").append(toIndentedString(monthOfYear)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `frequency` to the URL query string
    if (getFrequency() != null) {
      joiner.add(String.format("%sfrequency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrequency()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interval` to the URL query string
    if (getInterval() != null) {
      joiner.add(String.format("%sinterval%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInterval()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `daysOfWeek` to the URL query string
    if (getDaysOfWeek() != null) {
      for (int i = 0; i < getDaysOfWeek().size(); i++) {
        if (getDaysOfWeek().get(i) != null) {
          joiner.add(String.format("%sdaysOfWeek%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getDaysOfWeek().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    // add `weekStart` to the URL query string
    if (getWeekStart() != null) {
      joiner.add(String.format("%sweekStart%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWeekStart()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dayOfMonth` to the URL query string
    if (getDayOfMonth() != null) {
      joiner.add(String.format("%sdayOfMonth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDayOfMonth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `monthOfYear` to the URL query string
    if (getMonthOfYear() != null) {
      joiner.add(String.format("%smonthOfYear%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMonthOfYear()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `instance` to the URL query string
    if (getInstance() != null) {
      joiner.add(String.format("%sinstance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

