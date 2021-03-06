/*
 * Genome Nexus API
 * This page shows how to use HTTP requests to access the Genome Nexus API. There are more high level clients available in Python, R, JavaScript, TypeScript and various other languages as well as a command line client to annotate MAF and VCF. See https://docs.genomenexus.org/api.  Aside from programmatic clients there are web based tools to annotate variants, see https://docs.genomenexus.org/tools.   We currently only provide long-term support for the '/annotation' endpoint. The other endpoints might change.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import org.genome_nexus.ApiException;
import org.genome_nexus.client.IsoformOverride;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IsoformOverrideControllerApi
 */
@Ignore
public class IsoformOverrideControllerApiTest {

    private final IsoformOverrideControllerApi api = new IsoformOverrideControllerApi();

    
    /**
     * Gets the isoform override information for the specified source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchAllIsoformOverridesGETTest() throws ApiException {
        String source = null;
        List<IsoformOverride> response = api.fetchAllIsoformOverridesGET(source);

        // TODO: test validations
    }
    
    /**
     * Gets the isoform override information for the specified source and transcript id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchIsoformOverrideGETTest() throws ApiException {
        String source = null;
        String transcriptId = null;
        IsoformOverride response = api.fetchIsoformOverrideGET(source, transcriptId);

        // TODO: test validations
    }
    
    /**
     * Gets the isoform override information for the specified source and the list of transcript ids
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchIsoformOverridePOSTTest() throws ApiException {
        String source = null;
        List<String> transcriptIds = null;
        List<IsoformOverride> response = api.fetchIsoformOverridePOST(source, transcriptIds);

        // TODO: test validations
    }
    
    /**
     * Gets a list of available isoform override data sources
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchIsoformOverrideSourcesGETTest() throws ApiException {
        List<String> response = api.fetchIsoformOverrideSourcesGET();

        // TODO: test validations
    }
    
}
