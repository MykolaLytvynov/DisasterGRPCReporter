package ua.mykola.disastergrpcreporter.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.mykola.disastergrpcreporter.rest.dto.DisasterDto;
import ua.mykola.disastergrpcreporter.service.DisasterReporterClient;

@RestController
@RequestMapping("/disaster")
public class DisasterController {
    private DisasterReporterClient disasterReporterClient;

    @Autowired
    public DisasterController(DisasterReporterClient disasterReporterClient) {
        this.disasterReporterClient = disasterReporterClient;
    }


    @PostMapping
    public ResponseEntity<String> notify(@RequestBody DisasterDto disasterDto) {
        String response = disasterReporterClient.reportDisaster(
                disasterDto.getCity(),
                disasterDto.getCode(),
                disasterDto.getDescription()
        );
        return ResponseEntity.ok(response);
    }
}
