package command.impl;

import command.ifc.Command;
import lombok.AllArgsConstructor;
import org.example.standalone.service.ClusterVm;
import org.example.standalone.service.ClusterVmService;
import org.example.standalone.service.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

@AllArgsConstructor
public class ListCommand implements Command {

    private ClusterVmService clusterVmService;

    private Filter createFilter(String fieldName, Object value) {
        Filter filter = new Filter();
        filter.setFieldName(fieldName);
        filter.setValue(value);
        return filter;
    }

    @Override
    public void execute(Scanner scanner) {
        List<Filter> filters = new ArrayList<>();

        System.out.print("id: ");
        String idInput = scanner.nextLine();
        if (idInput != null && !idInput.isEmpty()) {
            UUID id = UUID.fromString(idInput);
            filters.add(createFilter("id", id));
        }

        System.out.print("vmid: ");
        String vmidInput = scanner.nextLine();
        if (vmidInput != null && !vmidInput.isEmpty()) {
            Integer vmid = Integer.parseInt(vmidInput);
            filters.add(createFilter("vmid", vmid));
        }

        System.out.print("name: ");
        String name = scanner.nextLine();
        if (name != null && !name.isEmpty()) {
            filters.add(createFilter("name", name));
        }

        System.out.print("image: ");
        String image = scanner.nextLine();
        if (image != null && !image.isEmpty()) {
            filters.add(createFilter("image", image));
        }

        System.out.print("cpu: ");
        String cpuInput = scanner.nextLine();
        if (cpuInput != null && !cpuInput.isEmpty()) {
            Integer cpu = Integer.parseInt(cpuInput);
            filters.add(createFilter("cpu", cpu));
        }

        System.out.print("memory: ");
        String memoryInput = scanner.nextLine();
        if (memoryInput != null && !memoryInput.isEmpty()) {
            Integer memory = Integer.parseInt(memoryInput);
            filters.add(createFilter("memory", memory));
        }

        List<ClusterVm> vms = clusterVmService.getClusterVmWebServicePort().getClusterVms(filters);
        if (!vms.isEmpty()) {
            System.out.println("Получены данные: ");
            for (ClusterVm vm : vms) {
                System.out.println("ClusterVm{" +
                        "id=" + vm.getId() +
                        ", vmid=" + vm.getVmid() +
                        ", name='" + vm.getName() + '\'' +
                        ", image='" + vm.getImage() + '\'' +
                        ", cpu=" + vm.getCpu() +
                        ", memory=" + vm.getMemory() +
                        '}');
            }
        } else {
            System.out.println("Ничего не нашлось :(");
        }
    }
}