package io.github.talentdevelopment004.optionals;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConfigRepository extends Repository<Config, Long> {
    private Map<Long, Config> configMap = new HashMap<>();

    public ConfigRepository() {
        configMap.put(1L, new Config(
                1L, "test", "test"));
        configMap.put(2L, new Config(
                2L, "prod", "specialComplexPassword"));

    }

    public Optional<Config> getCurrentConfig(long id) {
        Optional<Config> first = configMap.values().stream().filter(config -> config.getId() == id)
                .findFirst();

        return first;

    }

}
