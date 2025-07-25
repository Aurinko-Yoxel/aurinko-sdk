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

package io.aurinko.client;

import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeFeature;
import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class RFC3339InstantDeserializer<T extends Temporal> extends InstantDeserializer<T> {

    private final static boolean DEFAULT_NORMALIZE_ZONE_ID = JavaTimeFeature.NORMALIZE_DESERIALIZED_ZONE_ID.enabledByDefault();
    private final static boolean DEFAULT_ALWAYS_ALLOW_STRINGIFIED_DATE_TIMESTAMPS
    = JavaTimeFeature.ALWAYS_ALLOW_STRINGIFIED_DATE_TIMESTAMPS.enabledByDefault();

    public static final RFC3339InstantDeserializer<Instant> INSTANT = new RFC3339InstantDeserializer<>(
        Instant.class, DateTimeFormatter.ISO_INSTANT,
        Instant::from,
        a -> Instant.ofEpochMilli( a.value ),
        a -> Instant.ofEpochSecond( a.integer, a.fraction ),
        null,
        true, // yes, replace zero offset with Z
        DEFAULT_NORMALIZE_ZONE_ID,
        DEFAULT_ALWAYS_ALLOW_STRINGIFIED_DATE_TIMESTAMPS
    );

    public static final RFC3339InstantDeserializer<OffsetDateTime> OFFSET_DATE_TIME = new RFC3339InstantDeserializer<>(
        OffsetDateTime.class, DateTimeFormatter.ISO_OFFSET_DATE_TIME,
        OffsetDateTime::from,
        a -> OffsetDateTime.ofInstant( Instant.ofEpochMilli( a.value ), a.zoneId ),
        a -> OffsetDateTime.ofInstant( Instant.ofEpochSecond( a.integer, a.fraction ), a.zoneId ),
        (d, z) -> ( d.isEqual( OffsetDateTime.MIN ) || d.isEqual( OffsetDateTime.MAX ) ?
        d :
        d.withOffsetSameInstant( z.getRules().getOffset( d.toLocalDateTime() ) ) ),
        true, // yes, replace zero offset with Z
        DEFAULT_NORMALIZE_ZONE_ID,
        DEFAULT_ALWAYS_ALLOW_STRINGIFIED_DATE_TIMESTAMPS
    );

    public static final RFC3339InstantDeserializer<ZonedDateTime> ZONED_DATE_TIME = new RFC3339InstantDeserializer<>(
        ZonedDateTime.class, DateTimeFormatter.ISO_ZONED_DATE_TIME,
        ZonedDateTime::from,
        a -> ZonedDateTime.ofInstant( Instant.ofEpochMilli( a.value ), a.zoneId ),
        a -> ZonedDateTime.ofInstant( Instant.ofEpochSecond( a.integer, a.fraction ), a.zoneId ),
        ZonedDateTime::withZoneSameInstant,
        false, // keep zero offset and Z separate since zones explicitly supported
        DEFAULT_NORMALIZE_ZONE_ID,
        DEFAULT_ALWAYS_ALLOW_STRINGIFIED_DATE_TIMESTAMPS
    );

    protected RFC3339InstantDeserializer(
            Class<T> supportedType,
            DateTimeFormatter formatter,
            Function<TemporalAccessor, T> parsedToValue,
            Function<FromIntegerArguments, T> fromMilliseconds,
            Function<FromDecimalArguments, T> fromNanoseconds,
            BiFunction<T, ZoneId, T> adjust,
            boolean replaceZeroOffsetAsZ,
            boolean normalizeZoneId,
            boolean readNumericStringsAsTimestamp) {
        super(
                supportedType,
                formatter,
                parsedToValue,
                fromMilliseconds,
                fromNanoseconds,
                adjust,
                replaceZeroOffsetAsZ,
                normalizeZoneId,
                readNumericStringsAsTimestamp
        );
    }

    @Override
    protected T _fromString(JsonParser p, DeserializationContext ctxt, String string0) throws IOException {
        return super._fromString(p, ctxt, string0.replace( ' ', 'T' ));
    }
}