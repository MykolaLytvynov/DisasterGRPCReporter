package ua.mykola.disastergrpcreporter.service;

import emergency.Emergency;
import io.grpc.ManagedChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisasterReporterClient {
    private final emergency.DisasterServiceGrpc.DisasterServiceBlockingStub disasterServiceStub;

    @Autowired
    public DisasterReporterClient(ManagedChannel channel) {
        this.disasterServiceStub = emergency.DisasterServiceGrpc.newBlockingStub(channel);
    }

    // Method to send information about a new emergency situation
    public String reportDisaster(String cityName, int disasterCode, String description) {
        Emergency.DisasterReportRequest request = Emergency.DisasterReportRequest.newBuilder()
                .setCityName(cityName)
                .setDisasterCode(disasterCode)
                .setDescription(description)
                .build();

        Emergency.DisasterReportResponse response = disasterServiceStub.reportDisaster(request);
        return response.getStatus();
    }
}
