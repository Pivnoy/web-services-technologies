package command.impl;

import client.RequestSender;
import client.RequestType;
import command.ifc.Command;
import lombok.AllArgsConstructor;

import java.util.Scanner;
import java.util.UUID;

@AllArgsConstructor
public class  DeleteCommand implements Command {

    private RequestSender requestSender;

    @Override
    public void execute(Scanner scanner) {
        UUID id = null;
        System.out.print("Введите id виртуальное машины: ");
        try {
            String idInput = scanner.nextLine();
            if (idInput != null && !idInput.isEmpty()) {
                id = UUID.fromString(idInput);
            }

            String status = requestSender.sendMutateRequest("/" + id.toString(), RequestType.DELETE, "");

            System.out.println("Получен результат: " + status);
        } catch (IllegalArgumentException e) {
            System.out.println("Не удалось получить id " + e.getMessage());
        }

    }
}
